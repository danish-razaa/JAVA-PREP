import java.util.ArrayList;

class NameVerificationException extends Exception {
    public NameVerificationException(String message) {
        super(message);
    }
}

class Employee {
    private int id;
    private String name;
    private String gender;
    private double salary;

    public Employee(int id, String name, String gender, double salary)
            throws NameVerificationException {

        if (name.length() < 6) {
            throw new NameVerificationException(
                    "Name must contain at least 6 characters.");
        }

        this.id = id;
        this.name = name;
        this.gender = gender;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name;
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        try {
            employees.add(new Employee(101, "DanishR", "Male", 50000));
            employees.add(new Employee(102, "RahulK", "Male", 45000));
            employees.add(new Employee(103, "PriyaS", "Female", 55000));

            employees.add(new Employee(104, "Amit", "Male", 40000));

        } catch (NameVerificationException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("\nEmployee List:");
        for (Employee emp : employees) {
            System.out.println(emp); 
        }
    }
}