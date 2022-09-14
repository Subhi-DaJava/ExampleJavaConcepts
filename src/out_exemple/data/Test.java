package out_exemple.data;

public class Test {
    public static void main(String[] args) {
        int data = 100;
        System.out.println( data + " " );
        processData(data);
        System.out.print( data);
    }
    private static void processData(int data) {
        data=data * 2;
        //System.out.println(data);
    }
}
