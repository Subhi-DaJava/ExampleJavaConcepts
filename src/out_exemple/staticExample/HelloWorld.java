package out_exemple.staticExample;

public class HelloWorld {
    static int i = printHello();

    public static void main(String[] args) {
        System.out.println("Main");
    }
    public static int printHello(){
        System.out.println("Hello"); // program starts from static block
        return 1;
    }

}
