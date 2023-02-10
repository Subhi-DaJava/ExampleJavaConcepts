package threads_example.thread_extend.thread_user_daemon;

/**
 * Tous les threads précédents sont des threads de type user. La fin de la méthode main n'impose pas la fin de ces threads.
 * Un thread daemon se termine obligatoirement quand la main méthode main se termine.
 * La méthode setDaemon (boolean on) de la classe Thread passe en daemon le thread concerné.
 */
public class ThreadDaemon extends Thread {
    String nom;

    public ThreadDaemon(String s) {
        nom = s;
    }

    public void run() {
        String ch = getName();
        for (int i = 0; i < 30; i++) {
            System.out.println("Thread " + nom + " de nom " + ch + " i= " + i);
        }
    }
}

//class TestDaemon {
//    public static void main(String args[]) {
//        ThreadDaemon th1 = new ThreadDaemon("pluie");
//        ThreadDaemon th2 = new ThreadDaemon("soleil");
//        //th1.setDaemon(true); /*ligne1*/
//        //th2.setDaemon(true); /*ligne2*/
//        th1.start();
//        th2.start();
//        try {
//            Thread.sleep(1);
//        } catch (InterruptedException e) {
//            // Auto-generated catch block
//            e.printStackTrace();
//        }
//    }
//}

class TestDaemon {
    public static void main(String args[]) {
        ThreadDaemon th1 = new ThreadDaemon("pluie");
        ThreadDaemon th2 = new ThreadDaemon("soleil");
        th1.setDaemon(true); /*ligne1*/
        th2.setDaemon(true); /*ligne2*/
        th1.start();
        th2.start();
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            // Auto-generated catch block
            e.printStackTrace();
        }
    }
}

