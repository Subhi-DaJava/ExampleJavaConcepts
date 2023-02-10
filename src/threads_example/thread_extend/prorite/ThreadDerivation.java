package threads_example.thread_extend.prorite;

public class ThreadDerivation extends Thread {
    String nom;

    public ThreadDerivation(String s) {
        nom = s;
    }

    public void run() {
        String ch = this.getName();
        for (int i = 0; i < 3; i++) {
            int priorite = getPriority();

            System.out.println("Thread " + nom + " de nom " + ch + " i= " + i + " priorité = " + priorite);
            if ((nom.compareTo("pluie")) == 0) {
                setPriority(MIN_PRIORITY);
            } else if ((nom.compareTo("neige")) == 0) {
                setPriority(2);
            } else {
                setPriority(MAX_PRIORITY);
            }
        }
    }
}

class TestThread1 {
    public static void main(String args[]) {
        ThreadDerivation th1, th2;
        th1 = new ThreadDerivation("pluie");
        th2 = new ThreadDerivation("soleil");
        th1.start();
        th2.start();
    }
}

class TestThread2 {
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

