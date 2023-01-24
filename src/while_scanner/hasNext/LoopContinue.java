package while_scanner.hasNext;

/**
 * inside the for-loop, the continue statement causes control to immediately move to the increment/decrement statement;
 * inside the while or do-while loop, control immediately moves to the condition.
 */
public class LoopContinue {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("***********************************************************");
        System.out.println("Same as above");
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("***************************************");
        int m = 10;
        for (int i = 0; i < m; i++) {
            if (i * i < 36) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
