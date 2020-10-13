package Patterns.Proxy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ProxyCacheTest {

    @Test
    void noProxy() {
        IPageClient noProxy = new pageClient();
        Assertions.assertEquals("one", noProxy.getPage("1"));
        Assertions.assertEquals("one", noProxy.getPage("1"));
        Assertions.assertEquals("two", noProxy.getPage("2"));
    }
    @Test
    void proxy(){
        IPageClient proxy = new pageClientProxyCache();
        Assertions.assertEquals("one",proxy.getPage("1"));
        Assertions.assertEquals("one-cached",proxy.getPage("1"));
        Assertions.assertEquals("two",proxy.getPage("2"));
    }

}