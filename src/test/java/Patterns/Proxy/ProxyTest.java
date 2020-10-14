package Patterns.Proxy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ProxyTest {

    @Test
    void noProxy() {
        IPageClient noProxy = new pageClient();
        Assertions.assertEquals("this is the home page", noProxy.getPage("home"));
        Assertions.assertEquals("this is the about page", noProxy.getPage("about"));
        Assertions.assertEquals("this is the home page", noProxy.getPage("home"));

    }
    @Test
    void proxyCache(){
        IPageClient proxy = new pageClientProxyCache();
        Assertions.assertEquals("this is the home page",proxy.getPage("home"));
        Assertions.assertEquals("this is the about page",proxy.getPage("about"));
        Assertions.assertEquals("this is the home page(cached)",proxy.getPage("home"));
    }
    @Test
    void proxyAccess(){
        IPageClient proxy = new pageClientProxyAccess();
        Assertions.assertEquals("this is the home page",proxy.getPage("home"));
        Assertions.assertEquals("unavailable",proxy.getPage("contact"));
    }

}