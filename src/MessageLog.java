import java.util.*;
public class MessageLog implements Runnable {
    List<String> messages;
    public MessageLog(String ... msg) {
        messages = Arrays.asList(msg);
    }
    public void run() {
        try {
            for (String s: messages) {
                System.out.println(s);
                Thread.sleep(4000); //sleep 4 sec.
            }
        } catch (InterruptedException ex) {
            System.out.println(Thread.currentThread().getName()+
                    ": "+"I wasn't done !!!!");
        }
    }
}