package tableauExemple;

public class BinarySearch {

    /*
    tab[] : le tableau d'entiers dans lequel on va vérifier l'existence d'une valeur
    lastElt : dernier élément
    firstElt : premier élément
    target : valeur à vérifier
    */
    // 1ère approche : itérative
    public static boolean binarySearchIterative(int[] tab, int firstElt, int lastElt, int target) {
        int mid = (firstElt + lastElt) / 2; // index médian
        while (firstElt <= lastElt) {
            if (tab[mid] < target) {
                firstElt = mid + 1;

            } else if (tab[mid] == target) {
                System.out.println("L'élément se trouve à l'index: " + mid);
                return true;
            } else {
                lastElt = mid - 1;
            }
            mid = (firstElt + lastElt) / 2;
        }
        if (firstElt > lastElt) {
            System.out.println("L'élément n'existe pas!");
        }
        return false;
    }

    // 2ème approche : recursive
    public static boolean binarySearchRecursive(int[] tab, int firstElt, int lastElt, int target){
        if (lastElt >= firstElt){
            int mid = firstElt + (lastElt - firstElt)/2;

            if (tab[mid] == target){
                System.out.println("L'élément se trouve à l'index: " + mid);
                return true;
            }
            if (tab[mid] > target){
                // rechercher et vérifier dans le sous-tableau à gauche
                return binarySearchRecursive(tab, firstElt, mid-1, target);
            }else{
                // rechercher et vérifier dans le sous-tableau à droite
                return binarySearchRecursive(tab, mid+1, lastElt, target);
            }
        }
        System.out.println("L'élément n'existe pas");
        return false;
    }

}
