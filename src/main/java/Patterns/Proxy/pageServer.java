package Patterns.Proxy;
/*
* Mock connection to provider of resources called "pages"
* */
public class pageServer {
    public String pageByName(String name){
        if(name == "home"){
            return "this is the home page";
        }else if(name =="about"){
            return "this is the about page";
        }else if(name =="contact"){
            return "this is a contact info page";
        }else{
            return "page does not exist";
        }
    }
}
