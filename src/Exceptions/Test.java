package Exceptions;

import java.io.IOException;

class Parent {
    Parent() throws IOException {
        System.out.println("Parent");
    }
}
class Child extends Parent{
    Child() throws IOException{
        System.out.println("Child");
    }
}

public class Test {
    public static void main(String[] args) throws IOException {
        Parent obj = new Child();
    }
}


