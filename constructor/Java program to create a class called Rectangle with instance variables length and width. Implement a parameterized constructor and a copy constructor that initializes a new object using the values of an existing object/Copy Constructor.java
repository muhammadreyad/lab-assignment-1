class Rectangle {
    double length;
    double width;

    // 1. Parameterized constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // 2. Copy constructor
    public Rectangle(Rectangle other) {
        this.length = other.length;
        this.width = other.width;
    }
}

public class Main {
    public static void main(String[] args) {
        // Using the parameterized constructor
        Rectangle rect1 = new Rectangle(10.0, 5.0);

        System.out.println("--- Original Object (rect1) ---");
        System.out.println("Length: " + rect1.length);
        System.out.println("Width: " + rect1.width);

        // Using the copy constructor
        Rectangle rect2 = new Rectangle(rect1);

        System.out.println("\n--- Copied Object (rect2) ---");
        System.out.println("Length: " + rect2.length);
        System.out.println("Width: " + rect2.width);
    }
}