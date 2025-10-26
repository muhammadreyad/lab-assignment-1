class Cat {
    String name;
    int age;

    // Default constructor
    public Cat() {
        this.name = "Unknown";
        this.age = 0;
    }
}

public class Main {
    public static void main(String[] args) {
        Cat myCat = new Cat();

        System.out.println("Cat Name: " + myCat.name);
        System.out.println("Cat Age: " + myCat.age);
    }
}