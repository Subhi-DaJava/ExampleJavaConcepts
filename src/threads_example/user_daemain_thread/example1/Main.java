package threads_example.user_daemain_thread.example1;

/**
 * user thread and daemon
 */
public class Main {
    public static void main(String[] args) {
        final Thread name = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + "::" + Thread.currentThread().isDaemon());
            while (true) {

            }
        }, "name");

        // if name is Daemon
        // name.setDaemon(true);

        System.out.println(name.getState());

        name.start();

        System.out.println(Thread.currentThread() + " is over!");

    }
}
