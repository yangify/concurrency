package threads;

public class Main {

    public static void threadCreation() {
        // is more general because the Runnable object can subclass a class other than Thread.
        HelloRunnable runnable = new HelloRunnable();
        Runnable anonymousRunnable = new Runnable() {
            public void run() {
                System.out.println("Anonymous runnable");
            }
        };
        Runnable lambdaRunnable = () -> System.out.println("Lambda runnable");

        Thread[] threads = {new Thread(runnable), new Thread(anonymousRunnable), new Thread(lambdaRunnable)};
        for (Thread t: threads) {
            t.start();
        }

        // easier to use in simple applications, but is limited by the fact that your task class must be a descendant of Thread.
        HelloThread subclassThread = new HelloThread();
        subclassThread.start();

        // create anonymous subclass of Thread
        Thread anonymousThread = new Thread() {
            public void run() {
                System.out.println("Anonymous thread created");
            }
        };
        anonymousThread.start();
    }

    public static void main(String[] args) {
        threadCreation();

        // Call start() instead of run()
        // if run is called, the method is not executed by the new thread created but instead
        // executed by the thread of the method that created the thread
    }
}
