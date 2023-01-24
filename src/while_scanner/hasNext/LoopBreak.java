package while_scanner.hasNext;

/**
 * 1. The condition to continue the loop is always true,
 * but it will be successfully stopped when the variable i becomes 0 through the use of break inside the conditional statement.
 * 2. The break statement terminates only the loop in which it is currently located. If this loop is performed inside another loop, the outer loop won't be stopped.
 */
public class LoopBreak {
    public static void main(String[] args) {
        int i = 10;
        while (true) { // the condition to continue the loop
            if (i == 0) { // the condition to perform the break that stops this loop
                break;
            }
            System.out.println(i);
            i--;
        }
        System.out.println("*******************************************************");
        for (int k = 0; k < 10; k++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(j + " ");
                if (k == j) {
                    break;
                }
            }
            System.out.println();
        }

        System.out.println("***************************************************");
        // To stop the outer loop we could declare a Boolean variable stopped and use it as a special Boolean flag.
        boolean stopped = false;
        for (int ii = 0; ii < 10 && !stopped; ii++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(j + " ");
                if (ii == j) {
                    stopped = true;
                    break;
                }
            }
            System.out.println();
        }
    }
}
