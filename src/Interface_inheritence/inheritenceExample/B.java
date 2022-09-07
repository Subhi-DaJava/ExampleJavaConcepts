package Interface_inheritence.inheritenceExample;

import Interface_inheritence.inheritenceExample.A;

public class B extends A {
    public void talk() {
        System.out.println("I am B");
    }

    public void secretTalk() {

        this.talk();
    }

}
