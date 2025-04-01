package generics;

import java.util.List;



/*
    1. Upper Bound Wildcard (? extends T)
    Use Case: When you need to read data but not modify the collection.

    Example: Processing a list of numbers (polymorphism)

    Scenario: You have a function that calculates the sum of a list of numbers,
    where the list can contain any subtype of Number (e.g., Integer, Double, Float).


 */
public class UpperBoundExample {
    /*
    You can pass any type that extends Number (like Integer, Double, Float).

    You cannot add elements to the list because the exact type is unknown at runtime.
     */
    public static double sum(List<? extends Number> numbers) {
        double sum = 0.0;
        for (Number num : numbers) {
            sum += num.doubleValue(); // Safe because Number has doubleValue()
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> intList = List.of(1, 2, 3);
        List<Double> doubleList = List.of(1.1, 2.2, 3.3);

        System.out.println("Sum of integers: " + sum(intList));
        System.out.println("Sum of doubles: " + sum(doubleList));
    }
}

