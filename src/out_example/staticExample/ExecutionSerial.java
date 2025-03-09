package out_example.staticExample;

public class ExecutionSerial {
    static
    {
        System.out.println("Block 1");
    }

    public static void main(String args[])
    {
        System.out.println("Main Method");
    }

    static
    {
        System.out.println("Block 2");
    }
}
