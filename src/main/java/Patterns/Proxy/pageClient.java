package Patterns.Proxy;

public class pageClient implements IPageClient {

    private pageServer server = new pageServer();
    public pageClient() {
    }

    @Override
    public String getPage(String name) {
        return server.pageByName(name);
    }


}
