package table_multiplication;

public class TableMulti {
    public static void main(String[] args) {
        int num = 10;
        for (int i = 1; i < num; i++) {
            for (int j = 1; j < num; j++) {
                System.out.print(j + " x " + i + " = " + (i * j) + "    "); // i x j = i*j
                if(j == 9) {
                    System.out.println();
                }
            }

        }
    }
}
