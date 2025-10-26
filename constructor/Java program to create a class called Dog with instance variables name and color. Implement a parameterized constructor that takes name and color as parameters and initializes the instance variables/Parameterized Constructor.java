class Dog {
    String name;
    String color;

    // Parameterized constructor
    public Dog(String name, String color) {
        this.name = name;
        this.color = color;
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy", "Brown");

        System.out.println("Dog Name: " + myDog.name);
        System.out.println("Dog Color: " + myDog.color);
    }
}