package threads;

public class SleepMessages {
    public static void main(String[] args)
            throws InterruptedException {
        String[] importantInfo = {
                "Mares eat oats",
                "Does eat oats",
                "Little lambs eat ivy",
                "A kid will eat ivy too"
        };

        for (String s : importantInfo) {
            try {
                // Pause for 4 seconds
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                // We've been interrupted: no more messages
                throw new InterruptedException("message printing interrupted");
            }
            // Print a message
            System.out.println(s);
        }
    }
}
