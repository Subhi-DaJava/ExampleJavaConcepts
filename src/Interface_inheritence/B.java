package Interface_inheritence;

public class B extends A {
    public void talk() {
        System.out.println("I am B");
    }

    public void secretTalk() {

        this.talk();
    }

}
