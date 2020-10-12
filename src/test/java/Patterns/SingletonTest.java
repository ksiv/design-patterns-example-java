package Patterns;

import Patterns.Singleton.SequenceSingleton;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;



class SingletonTest {
    @Test
    public void raceConditionTest() throws Exception {
        int count = 10000;
        Set<Integer> uniqueSequences = getUniqueSequences(count);
        Assertions.assertEquals(count, uniqueSequences.size());
    }

    private Set<Integer> getUniqueSequences(int count) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(100);
        Set<Integer> uniqueSequences = new LinkedHashSet<>();
        List<Future<Integer>> futures = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            futures.add(executor.submit(SequenceSingleton.getInstance()::getNext));
        }

        for (Future<Integer> future : futures) {
            uniqueSequences.add(future.get());
        }

        executor.awaitTermination(1, TimeUnit.SECONDS);
        executor.shutdown();

        return uniqueSequences;
    }
}