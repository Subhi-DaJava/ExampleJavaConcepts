package singletonclass;

public class SingletonA {
    private static SingletonA singleton_instance = null;
    public String str;
    private SingletonA() {
        str = "Hello, I'm a string part of SingletonA class";
    }
    public static SingletonA getInstance() {
        if(singleton_instance == null) {
            singleton_instance = new SingletonA();
        }
        return singleton_instance;
    }

}
