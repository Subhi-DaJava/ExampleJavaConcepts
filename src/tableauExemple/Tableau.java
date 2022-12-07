package tableauExemple;

import java.util.Arrays;

public class Tableau {
    int[] tab;
    // Constructeur
    public Tableau(int n){
        tab = new int[n];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = (int)(Math.random()*100 - 50);
        }
    }
    // Méthode afficher
    public void afficher(){
        for (int elt : tab) {
            System.out.print(elt + "   ");
        }
    }
    // Méthode rechercher
    public int rechercher(int nombre){
        int indice = -1;
        for (int i = 0; i < tab.length; i++) {
            if(tab[i] == nombre){
                indice = tab[i];
            }
        }
        return indice;
    }
    // Méthode somme
    public int somme(){
        int somme = 0;
        for (int i = 0; i < tab.length; i++) {
            somme+=tab[i];
        }
        return somme;
    }
    // Méthode moyenne
    public double moyenne(){
        return (double) somme()/tab.length;
    }

    // Méthode ordonner
    public void ordonner(){
        int temp;
        for (int i = 0; i < tab.length; i++) {
            for (int j = 1 ; j < tab.length - i; j++) {
                if(tab[j-1] > tab[j]){
                    temp = tab[j-1];
                    tab[j-1] = tab[j];
                    tab[j] = temp;
                }
            }
        }
    }

    // Méthode maximum
    public int maximum(){
        ordonner();
        return tab[tab.length-1];
    }

    // Méthode Max
    public int max(){
        int max = tab[0];
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > max){
                max = tab[i];
            }
        }
        return max;
    }

    // Méthode minimum
    public int minimum(){
        ordonner();
        return tab[0];
    }

    // Méthode Min
    public int min(){
        int min = tab[0];
        for (int i = 0; i < tab.length; i++) {
            if(tab[i] < min) {
                min = tab[i];
            }
        }
        return min;
    }

    // Méthode occurrenceNombre
    public int occurrenceNombre(int nombre){
        int compteur = 0;
        for (int i = 0; i < tab.length; i++) {
            if ( tab[i] == nombre) {
                compteur ++;
            }
        }
        return compteur;
    }

    // Nombres fréquents
    public void nombresFrequents(){
        int frequence = 0;
        int valeur = tab[0];
        int frequence2 = 0 ;
        int valeur2 = tab[0];
        for (int i = 0; i < tab.length; i++) {
            if (occurrenceNombre(tab[i]) > frequence){
                frequence = occurrenceNombre(tab[i]);
                valeur = tab[i];
            }
        }
        System.out.println("Le nombre le plus fréquent est " + valeur + ", il se répète " + frequence + " fois.");

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == valeur) continue;
            if (occurrenceNombre(tab[i]) > frequence2){
                frequence2 = occurrenceNombre(tab[i]);
                valeur2 = tab[i];
            }
        }
        System.out.println("Le deuxième nombre le plus fréquent est " + valeur2 + ", il se répète " + frequence2 + " fois.");
    }
    // Trouver un élément avec binarySearch
    public boolean binarySearch(int target){
        Arrays.sort(tab);
        int low = 0;
        int high = tab.length-1;

        while (low <= high){
            int middle = low + (high - low) / 2;
            int middleValue = tab[middle];
            System.out.println("Middle est " + middleValue);

            if(target == middleValue){
                return true;
            }
            if (target > middleValue){
                low = middle + 1;
            }
            if(target < middleValue){
               high = middle -1 ;
            }
        }
        return false;
    }

}
