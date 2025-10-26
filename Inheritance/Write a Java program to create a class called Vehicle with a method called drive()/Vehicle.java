class Vehicle {
    public void drive() {
        System.out.println("Driving a vehicle.");
    }
}

class Car extends Vehicle {
    @Override
    public void drive() {
        System.out.println("Repairing a car");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        myCar.drive();
    }
}