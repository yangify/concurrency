package threads;

public class Main {

    public static void threadCreation() {
        // is more general because the Runnable object can subclass a class other than Thread.
        HelloRunnable runnable = new HelloRunnable();
        Thread thread = new Thread(runnable);
        thread.start();

        // easier to use in simple applications, but is limited by the fact that your task class must be a descendant of Thread.
        HelloThread subclassThread = new HelloThread();
        subclassThread.start();
    }

    public static void main(String[] args) {
        threadCreation();
    }
}
