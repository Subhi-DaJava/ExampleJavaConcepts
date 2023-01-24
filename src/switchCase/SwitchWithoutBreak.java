package switchCase;

/**
 * What is the value of var2 after executing the following code?
 */
public class SwitchWithoutBreak {
    public static void main(String[] args) {
        int var1 = 100;
        int var2 = 0;
        switch (var1) {
            case 100:
                var2 += var1;
            case 200:
                var2 += var1 / 4;
            case 300:
                var2 += var1 / 10;
            default:
                var2 = 500;
        }
        System.out.println("Var2 = " + var2);
    }
}
