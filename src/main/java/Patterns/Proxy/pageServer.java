package Patterns.Proxy;

public class pageServer {
    public String pageByName(String name){
        if(name == "1"){
            return "one";
        }else if(name =="2"){
            return "two";
        }else if(name =="3"){
            return "three";
        }else{
            return "page does not exist";
        }
    }
}
