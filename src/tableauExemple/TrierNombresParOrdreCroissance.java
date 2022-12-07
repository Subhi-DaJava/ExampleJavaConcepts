package tableauExemple;

/**
 * Trier un tableau de nombre par ordre de croissance
 * @author سۈبھى
 */
public class TrierNombresParOrdreCroissance {
    public static void trier(int[] tableau) {
        int max, i, j;

        for(i = 1; i < tableau.length; i++) {
            max = tableau[i];
            j = i;
            while (j >= 1 &&  tableau[j-1] > max) {
                tableau[j] = tableau[j-1];
                j = j- 1;
            }
            tableau[j] = max;
        }
    }

    public static void main(String[] args) {
        int[] tableau = { 20, 1, 2, 4, 3, 5, 8, 2, 6, 10, 7 };

        trier(tableau);
        for(int elt : tableau)  {
            System.out.print(elt + " ");
        }
    }
}
