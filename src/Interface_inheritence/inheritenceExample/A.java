package Interface_inheritence.inheritenceExample;

public class A {
    public void talk()
    {
        System.out.println("I am A");
    }

    public void secretTalk() {

        this.talk();
    }
}
