
// Interface
interface Flyable {
    void fly();   // interface method
}

// Abstract Class
abstract class Vehicle {
    abstract void start();  // abstract method

    void fuelType() {       // normal method
        System.out.println("Petrol/Diesel");
    }
}

// Concrete Class
class Aeroplane extends Vehicle implements Flyable {
    public void start() {
        System.out.println("Aeroplane starting with jet engines!");
    }

    public void fly() {
        System.out.println("Aeroplane is flying high!");
    }
}

// Test Class
public class MAIN1 {
    public static void main(String[] args) {
        Aeroplane plane = new Aeroplane();
        plane.start();
        plane.fuelType();
        plane.fly();
    }
}
