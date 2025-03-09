package out_example.overloading;

public class Test {
    public static void main(String[] args) {
        OverloadingTest ol = new OverloadingTest();
        ol.sum(1,1f);
        ol.sum(1f, 1);
    }
}
