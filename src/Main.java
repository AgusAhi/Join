import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int seconds = 0;
        if (args.length > 0) {
            seconds = Integer.parseInt(args[0]);
        }
        String[] messages = {
            "Message 1", "Message 2", "Message 3", "Message 4"};
        MessageLog msg = new MessageLog(messages);
        Thread thread = new Thread(msg);
        thread.start();
        int count = 0;
        while (count < seconds) {
            Thread.sleep(1000);
            count++;
            if (thread.isAlive() && count >= seconds) {
                thread.interrupt();
            }
        }
        thread.join();
        System.out.println("The End of Evangelion");
    }
}
