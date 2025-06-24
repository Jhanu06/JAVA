// // Threads

// class A extends Thread {
//     public void run() {
//         for (int i = 0; i <= 10; i++) {
//             System.out.println("hlo");
//         }
//     }
// }

// class B extends Thread {
//     public void run() {
//         for (int i = 0; i <= 10; i++) {
//             System.out.println("hii");
//             try {
//                 Thread.sleep(10); // Sleep for 10 milliseconds
//             } catch (InterruptedException e) {
//                 System.out.println(e);
//             }
//         }
//     }
// }

// public class Demo {
//     public static void main(String[] args) {
//         A obj = new A();    // Thread 1
//         B obj1 = new B();   // Thread 2

//         // Start the threads
//         obj.start();
//         obj1.start();

//         // (Optional) Print thread priority
//         System.out.println("Priority of obj: " + obj.getPriority());
//         System.out.println("Priority of obj1: " + obj1.getPriority());
//     }
// }
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Runnable Thread running...");
    }
}

class test {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread t1 = new Thread(myRunnable); // Pass object to Thread
        t1.start();
    }
}
