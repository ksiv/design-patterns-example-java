package Patterns.Proxy;

import java.util.HashMap;
import java.util.Map;
/*
* Proxy to implement a cache 
 * */

public class pageClientProxyCache implements IPageClient {
    private Map<String, String> mapInMemoryPageCache = new HashMap<String, String>();
    public pageClientProxyCache(){
    }
    @Override
    public String getPage(String name) {
        String page;
        if (null !=mapInMemoryPageCache.get(name)){
            return mapInMemoryPageCache.get(name);
        }else{
            // Proxy line
            page = new pageClient().getPage(name);
            mapInMemoryPageCache.put(name,page+"(cached)");
            return page;
        }

    }
}
