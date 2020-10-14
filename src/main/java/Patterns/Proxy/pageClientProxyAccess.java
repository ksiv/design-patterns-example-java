package Patterns.Proxy;
/*
* Proxy to implement an additional level of access control
* */

public class pageClientProxyAccess implements IPageClient {
    @Override
    public String getPage(String name) {
        String page;
        if ("contact" == name){
            return "unavailable";
        }else{
            // Proxy line
            page = new pageClient().getPage(name);
            return page;
        }

    }
}
