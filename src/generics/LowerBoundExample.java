package generics;

import java.util.ArrayList;
import java.util.List;

class Person {}
class Employee extends Person {}
class Manager extends Employee {}

public class LowerBoundExample {
    public static void addManagers(List<? super Manager> list) {
        list.add(new Manager()); // Allowed because Manager is within the bounds
        // list.add(new Employee()); // ❌ Compilation error, as Employee is not a subclass of Manager
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        List<Person> persons = new ArrayList<>();

        addManagers(employees);  // Works because Employee is a superclass of Manager
        addManagers(persons);    // Works because Person is a superclass of Manager

        System.out.println("Managers added successfully!");
    }
}

