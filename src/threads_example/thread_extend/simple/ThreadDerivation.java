package threads_example.thread_extend.simple;

/**
 * Les threads sont créés lors de l’appel du constructeur.
 * void run() : cette méthode est définie dans la classe java.lang.thread, où elle ne
 * fait rien ; il faut la redéfinir en y donnant le code correspondant à ce qu'on attend du thread
 * correspondant. La méthode run doit être appelée par l'intermédiaire de la méthode start.
 * void start() : la méthode start est définie dans la classe java.lang.thread. Elle
 * appelle la méthode run pour démarrer le thread, et ce qui est très particulier est qu'elle
 * "retourne" immédiatement, sans attendre que la méthode run ait terminée son travail.
 * String getName() : méthode de la classe Thread qui retourne le nom attribué par Java au
 * thread.
 * <p>
 * Tous les threads précédents sont des threads de type user. La fin de la méthode main
 * n'impose pas la fin de ces threads.
 * <p>
 * Un thread daemon se termine obligatoirement quand la main méthode main se termine.
 * La méthode setDaemon (boolean on) de la classe Thread passe en daemon le thread
 * concerné.
 */
public class ThreadDerivation extends Thread {
    String nom;

    public ThreadDerivation(String s) {
        nom = s;
    }

    public void run() {
        String ch = getName();
        for (int i = 0; i < 3; i++) {
            System.out.println("Thread " + nom + " de nom " + ch + " i= " + i);
        }
    }
}

class TestThread1 {
    public static void main(String args[]) {
        ThreadDerivation th1, th2, th3;
        th1 = new ThreadDerivation("pluie");
        th2 = new ThreadDerivation("soleil");
        th3 = new ThreadDerivation("neige");
        th1.start();
        th2.start();
        th3.start();

    }
}

/*
L’instruction th1.join(); suspend la méthode appelante jusqu’à ce que le thread th1 se termine.
L’instruction th2.join(); suspend la méthode appelante jusqu’à ce que le thread th2 se termine.
 */
class TestThread2 {
    public static void main(String args[]) throws InterruptedException {
        ThreadDerivation th1, th2, th3;
        th1 = new ThreadDerivation("pluie");
        th2 = new ThreadDerivation("soleil");
        th1.start();
        th2.start();
        th1.join();
        th1.join();
        System.out.println("Threads terminés");

    }
}

class TestThread3 {
    public static void main(String args[]) throws InterruptedException {
        ThreadDerivation th1, th2, th3;
        th1 = new ThreadDerivation("pluie");
        th2 = new ThreadDerivation("soleil");
        th1.start();
        th2.start();
    }
}
