package Patterns.Proxy;

import java.util.HashMap;
import java.util.Map;

public class pageClientProxyCache implements IPageClient {
    private pageServer server = new pageServer();
    private Map<String, String> mapInMemoryPageCache = new HashMap<String, String>();

    public pageClientProxyCache(){
    }
    @Override
    public String getPage(String name) {
        String page;
        if (null !=mapInMemoryPageCache.get(name)){
        return mapInMemoryPageCache.get(name);
        }else{
        page = server.pageByName(name);
        mapInMemoryPageCache.put(name,page+"-cached");
        return page;
        }

    }
}
