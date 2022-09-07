package Interface_inheritence.interfaceExample;

public class Main {
    public static void main(String[] args) {
        Try p1 = new Try(); // make obj using the class which implements
        p1.print();
        Test p2 = new Test();
        p2.print();

        System.out.println("*********************************************");

        Printable p3 = new Try(); // make obj using the class which implements
        p3.print();
        Printable p4 = new Test();
        p4.print();

        System.out.println("***************************************************");
        Printable p5 = () -> System.out.println("I am learning package."); // Printable is a Functional Interface
        p5.print();
        Printable p6 = () -> System.out.println("I am learning interface.");
        p6.print();

    }
}
