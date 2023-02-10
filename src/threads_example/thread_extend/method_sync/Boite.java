package threads_example.thread_extend.method_sync;

/**
 * En Java, chaque objet class dispose d’un verrou, ce verrou peut être utilisé en déclarant dans la classe des méthodes synchronized.
 * Le verrou est pris quand une méthode synchronized s’exécute, le verrou est libéré dès que la
 * méthode synchronized se termine. On réalise ainsi un mécanisme d’exclusion mutuelle.
 * Une méthode synchronized est dite atomique parce que la JVM ne l’exécutera jamais
 * plusieurs fois « simultanément » : une méthode synchronized d’un objet ne peut interrompre
 * une méthode synchronized du même objet qui est en cours d’exécution.
 * <p>
 * Une classe Boite contient un tableau de 30 entiers dont les valeurs vont de 0 à 29. On crée 2
 * threads, chaque thread doit afficher le tableau en entier.
 */
public class Boite {
    int[] Tableau;

    public Boite() {
        Tableau = new int[30];
        for (int i = 0; i < 30; i++) Tableau[i] = i;
    }

    public synchronized void afficher() { //méthode à tester synchronisée ou non
        for (int i = 0; i < 30; i++) // balaye le tableau pour l’afficher
        {
            System.out.print(Tableau[i] + " ");
        }
        System.out.println("");
    }

  /*  public *//*synchronized*//* void afficher() { //méthode à tester synchronisée ou non
        for (int i = 0; i < 30; i++) // balaye le tableau pour l’afficher
        {
            System.out.print(Tableau[i] + " ");
        }
        System.out.println("");
    }*/
}

class Thread6 extends Thread {
    String nom;
    public Boite tableau;

    public Thread6(String nom) {
        this.nom = nom;
    }

    public void run() {
        tableau.afficher();
    }
}

class TestThread6 {
    public static void main(String args[]) {
        Boite b = new Boite();
        Thread6 t1, t2;
        t1 = new Thread6("liretableau1");
        t2 = new Thread6("liretableau2");
        t1.tableau = b;
        t2.tableau = b;
        t1.start();
        t2.start();
    }

    // 1. On constate que l’affichage des 2 tableaux est mélangé.
    // 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 23 24 25 26 27 28 29
    //27 28 29
    // 2. Il faut enlever les commentaires autour du mot synchronized de la ligne public
    ///*synchronized */ void afficher(), compiler et exécuter. L’affichage résultant suivant
    //convient maintenant.
    // 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29
    // 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29
}
