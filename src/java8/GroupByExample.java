package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private String department;
    private double salary;

    // constructor, getters, setters
    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }

    @Override
    public String toString() {
        return name + " - " + salary;
    }
}

public class GroupByExample {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "IT", 70000),
                new Employee("Bob", "HR", 50000),
                new Employee("Charlie", "IT", 80000),
                new Employee("David", "Finance", 60000),
                new Employee("Eve", "HR", 55000)
        );
        //group by department
        Map<String, List<Employee>> collect = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println(collect);
        //group by : Average Salary by Department
        Map<String, Double> collect1 = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, 
                        Collectors.averagingDouble(Employee::getSalary)));

        System.out.println(collect1);

        employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.mapping(Employee::getName, Collectors.toList())));
    }

}
