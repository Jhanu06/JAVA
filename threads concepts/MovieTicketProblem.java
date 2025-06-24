//🎬 Program 1: Without Synchronization (Race Condition Problem)

// MovieBookApp class create chesam which implements Runnable.

class MovieBookApp implements Runnable {

// It has: availableSeats = 1 → Only 1 ticket available.
// wantedSeats → Each friend wants 1 seat.

    int availableSeats = 1;
    int wantedSeats;

    MovieBookApp(int wantedSeats) {
        this.wantedSeats = wantedSeats;
    }

// run() method lo booking logic undi:
// Check: available seats unnaaya?
// If yes → Book and decrease availableSeats.
//Else → Booking fail.

    public void run() {
        if (availableSeats >= wantedSeats) {
            System.out.println(Thread.currentThread().getName() + " booked " + wantedSeats + " seat(s) successfully!");
            availableSeats = availableSeats - wantedSeats;
        } else {
            System.out.println(Thread.currentThread().getName() + " failed to book seat(s).");
        }
    }
}

public class MovieTicketProblem {
    public static void main(String[] args) {
        //One object create chesam → booking.
        MovieBookApp booking = new MovieBookApp(1);
         //Two threads t1 and t2 create chesam using same booking object.
        Thread t1 = new Thread(booking);
        Thread t2 = new Thread(booking);

        t1.setName("Friend1");
        t2.setName("Friend2");
 // t1 and t2 at the same time check chesthayi: "Are seats available?"
 // Appudu rendu threads ki yes anipistundi.
 // Rendu bookings jarugutayi.
        t1.start();
        t2.start();
        //Only 1 ticket undi, but rendu friends ki confirm ayindi = Race condition = ❌ Wrong Behavior!
    }
}

//Program 2: With Synchronization (Proper Solution)
// public void run() {
//     synchronized (this) {  // Lock chesthunam
//         if (availableSeats >= wantedSeats) {
//             System.out.println(Thread.currentThread().getName() + " booked " + wantedSeats + " seat(s) successfully!");
//             availableSeats = availableSeats - wantedSeats;
//         } else {
//             System.out.println(Thread.currentThread().getName() + " failed to book seat(s).");
//         }


// Same logic, but synchronized (this) block add chesam inside run().
// synchronized ante:
// 1.Thread1 booking start chesthe, object lock chesthundi.
// 2.Thread2 must wait until Thread1 completes booking.
// 3.So no two threads can book at the same time.