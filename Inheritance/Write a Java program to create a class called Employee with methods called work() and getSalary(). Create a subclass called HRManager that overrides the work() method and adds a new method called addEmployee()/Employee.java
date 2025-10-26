class Employee {
    private double salary;

    public Employee(double salary) {
        this.salary = salary;
    }

    public void work() {
        System.out.println("Employee is working.");
    }

    public double getSalary() {
        return salary;
    }
}

class HRManager extends Employee {

    public HRManager(double salary) {
        super(salary);
    }

    @Override
    public void work() {
        System.out.println("HR Manager is managing human resources.");
    }

    public void addEmployee() {
        System.out.println("HR Manager is adding a new employee.");
    }
}

public class Main {
    public static void main(String[] args) {
        HRManager manager = new HRManager(80000.0);

        // Call the overridden method
        manager.work();

        // Call the new method specific to HRManager
        manager.addEmployee();

        // Call the inherited method
        System.out.println("Manager's Salary: " + manager.getSalary());
    }
}