package table_multiplication;

public class TableMulti {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                System.out.print(j + " x " + i + " = " + (i * j) + "    "); // i x j = i*j
                if(j == 10) {
                    System.out.println();
                }
            }

        }
    }
}
