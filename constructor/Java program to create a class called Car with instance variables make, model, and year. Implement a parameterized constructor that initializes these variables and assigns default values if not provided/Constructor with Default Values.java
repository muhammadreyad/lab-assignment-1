class Car {
    String make;
    String model;
    int year;

    // 1. The main parameterized constructor
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // 2. A constructor if only make and model are provided (defaults year)
    public Car(String make, String model) {
        // Calls the main constructor, providing a default year
        this(make, model, 2024); 
    }

    // 3. A constructor if no values are provided (all defaults)
    public Car() {
        // Calls the 2-arg constructor, which in turn calls the 3-arg one
        this("Unknown", "Unknown");
    }
}

public class Main {
    public static void main(String[] args) {
        
        // Case 1: All parameters provided
        Car car1 = new Car("Ford", "Mustang", 1969);
        System.out.println("--- Car 1 (All Params) ---");
        System.out.println("Make: " + car1.make);
        System.out.println("Model: " + car1.model);
        System.out.println("Year: " + car1.year);

        // Case 2: Year not provided (uses default year 2024)
        Car car2 = new Car("Tesla", "Model 3");
        System.out.println("\n--- Car 2 (Default Year) ---");
        System.out.println("Make: " + car2.make);
        System.out.println("Model: " + car2.model);
        System.out.println("Year: " + car2.year);

        // Case 3: No parameters provided (all defaults)
        Car car3 = new Car();
        System.out.println("\n--- Car 3 (All Defaults) ---");
        System.out.println("Make: " + car3.make);
        System.out.println("Model: " + car3.model);
        System.out.println("Year: " + car3.year);
    }
}