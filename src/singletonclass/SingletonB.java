package singletonclass;

public class SingletonB {
    private static SingletonB singleton_instance = null;
    public String str;
    private SingletonB() {
        str = "Hello, I'm a string part of SingletonB class";
    }
    public static SingletonB SingletonB(){
        if(singleton_instance == null) {
            singleton_instance = new SingletonB();
        }
        return singleton_instance;
    }
}
