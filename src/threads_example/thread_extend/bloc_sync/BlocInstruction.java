package threads_example.thread_extend.bloc_sync;

/**
 * Ce mécanisme implémente l’exclusion mutuelle, c’est à dire que l’accès d’un thread à la
 * ressource commune par une fonction « synchonized » de la ressource ou dans un bloc
 * d’instructions « synchonized » sur la ressource interdit aux autres threads d’accéder à cette
 * ressource par des fonctions « synchonized » sur la ressource ou dans leurs propres blocs
 * d’instructions « synchonized » sur la ressource.
 *
 * L’exemple suivant présente toujours le problème de l’accès par 2 threads à une ressource
 * commune. Chaque thread a son propre tableau de nombres, on veut qu’un 1er thread affiche
 * entièrement son tableau puis que le 2nd affiche le sien et sans que les affichages se mélangent.
 */
public class BlocInstruction extends Thread {
    String nom;
    int debut;
    int fin;

    public BlocInstruction(String nom, int d, int f) {
        this.nom = nom;
        debut = d; // 1er nombre début du tableau
        fin = f; // dernier nombre fin du tableau
    }

 /*   public void run() {
        for (int i = debut; i < fin; i++) {
            System.out.println(nom + " " + i + " "); // ressource commune
        }
    }*/

    // Il faut indiquer que cette boucle d’affichage ne doit pas être interrompue. On effectue cela en
    // posant un verrou sur l’objet commun System.out à l’aide du mot réservé synchronized de la manière suivante :
    // synchronized (System.out) {bloc d’instructions qui ne doit pas être interrompu}
    public void run() {
        synchronized (System.out) {
            for (int i = debut; i < fin; i++) {
                System.out.println(nom + " " + i + " "); // ressource commune
            }
        }
    }
}

class TestThread3 {
    public static void main(String args[]) {
        BlocInstruction t1, t2;
        t1 = new BlocInstruction("soleil", 10, 30);
        t2 = new BlocInstruction("pluie", 50, 70);
        t1.start();
        t2.start();
        /*
        On constate que les affichages sont mélangés.
        Chaque thread est interrompu par la JVM pour
        laisser l’exécution à l’autre alors qu’il n’a pas
        terminé d’exécuter la boucle d’affichage.
         */

        // Les 2 threads partagent la ressource commune – le même objet commun - "System.out" pour afficher.
    }
}
