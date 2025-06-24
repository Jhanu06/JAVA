class Sender extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Sending message " + i);
            try {
                Thread.sleep(500); // sleep for 0.5 seconds
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class Receiver extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Receiving message " + i);
            try {
                Thread.sleep(700); // sleep for 0.7 seconds
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class WhatsAppSimulation {
    public static void main(String[] args) {
        Sender sender = new Sender();
        Receiver receiver = new Receiver();

        sender.start();    // start sending thread
        receiver.start();  // start receiving thread
    }
}
