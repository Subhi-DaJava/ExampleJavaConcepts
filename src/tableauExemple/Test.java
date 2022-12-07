package tableauExemple;

public class Test {
    public static void main(String[] args) {
        // Afficher tableau
        Tableau t = new Tableau(20);
        System.out.println("**************************** afficher le tableau  ********************************");
        t.afficher();

        // Rechercher un élément
        System.out.println();
        System.out.println("**************************** rechercher un élément  ********************************");
        System.out.println(t.rechercher(5));

        // Somme
        System.out.println("**************************** somme des éléments  ********************************");
        System.out.println(t.somme());

        // Moyenne
        System.out.println("**************************** moyenne  ********************************");
        System.out.println("La moyenne d'élément : " + t.moyenne());

        // Ordonner
        System.out.println("**************************** ordonner  ********************************");
        t.ordonner();
        t.afficher();
        System.out.println();

        // Maximum
        System.out.println("**************************** Maximum  ********************************");
        System.out.println("Le maximum est : " + t.maximum());

        // Max
        System.out.println("**************************** Max  ********************************");
        System.out.println("Le max est : " + t.max());

        // Minimum
        System.out.println("**************************** Minimum ********************************");
        System.out.println("Le minimum est : " + t.minimum());
        // Min
        System.out.println("**************************** Min  ********************************");
        System.out.println("Le minimum est : " + t.min());

        // Occurrence Nombre
        System.out.println("**************************** Occurrence Nombre  ********************************");
        int nombre = 10 ;
        System.out.println("L'occurrence de " + nombre + " est " + t.occurrenceNombre(nombre) + " fois.");

        // Nombres Fréquentes
        System.out.println("**************************** Nombres fréquents  ********************************");
        t.nombresFrequents();

        // Binary Search
        System.out.println("******************************* Binary Search ***************************************");

        System.out.println(t.binarySearch(42));

        // Binary Search iterative
        System.out.println("********************************* Binary Search Iterative *************************************");
            int[] tab = {1, 2, 3, 4, 5, 6, 7};
            int target = 4;
            int l = tab.length-1;

        System.out.println(BinarySearch.binarySearchIterative(tab,0,l,target));
        System.out.println("******************************************* Binary Search Recursive **********************************************");
        System.out.println(BinarySearch.binarySearchRecursive(tab,0, l, 7));
    }
}
