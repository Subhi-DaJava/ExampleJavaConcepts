package out_exemple;

public class VariableNotInit {
    public static void main(String args[]) {
        int x = 12 ;
        int a = 3; // should be initialized
        
        if( x < 15)
        a = 5;
        System.out.print(a);
    }

}
