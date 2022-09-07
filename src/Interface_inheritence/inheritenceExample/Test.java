package Interface_inheritence.inheritenceExample;

import Interface_inheritence.inheritenceExample.A;
import Interface_inheritence.inheritenceExample.B;

public class Test {
    public static void main(String[] args) {
        A b = new B();
        b.talk();
        b.secretTalk();
    }

}

