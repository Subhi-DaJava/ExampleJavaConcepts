package threads_example.thread_implement.simple;

/**
 * L’interface java.lang.Runnable offre la possibilité de créer une classe avec 2
 * comportements : un comportement « classique » mais également un comportement de type
 * thread. Lorsque l'objet est créé, on peut démarrer le thread quand c'est nécessaire, la fin du
 * thread n'entraînant pas la fin de l'objet.
 */
public class ThreadImplement implements Runnable {
    String chaine;

    ThreadImplement(String chaine) {
        this.chaine = chaine;
    }

    public void run() {
        for (int i = 0; i < 2; i++) {
            // Le nom du thread est obtenu par la méthode Thread.currentThread() : "Thread-n" est le nom du thread
            // 5 sa priorité et main le groupe de thread auquel il appartient par défaut. Résultat : soleil Thread[Thread-0,5,main]
            System.out.println(chaine + " " + Thread.currentThread());
        }
    }
}

class TestThread2 {
    public static void main(String[] argv) {
        // L’application doit instancier un objet cible implémentant Runnable
        ThreadImplement th1 = new ThreadImplement("soleil");
        ThreadImplement th2 = new ThreadImplement("pluie");
        ThreadImplement th3 = new ThreadImplement("neige");
        // créer un thread en utilisant le constructeur Thread (Runnable cible) et le démarrer
        new Thread(th1).start(); // Thread t = new Thread(th1) ; t.start();
        new Thread(th2).start();
        new Thread(th3).start();
    }
}
