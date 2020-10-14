package Patterns.Proxy;
/*
* A simple client requesting resources called "pages" by their names
*
* */
public interface IPageClient {
     String getPage(String name);
}
