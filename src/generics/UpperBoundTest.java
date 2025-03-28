package generics;

import java.util.List;

/*
    1. Upper Bound Wildcard (? extends T)
    Use Case: When you need to read data but not modify the collection.

    Example: Processing a list of numbers (polymorphism)

    Scenario: You have a function that calculates the sum of a list of numbers,
    where the list can contain any subtype of Number (e.g., Integer, Double, Float).
 */
public class UpperBoundTest {

    /*
    WE CALL IT UPPER BOUND AS WE CAN ONLY USE CLASSES THAT EXTENDS NUMBER CLASS,
    WE CANT USE SUPER CLASS OF NUMBER IN BELOW METHOD, ONLY LOWER CLASS WILL BE PASSED.
    THINK LIKE ITS ROOF
     */
    public static double sum(List<? extends Number> numbers){
        double sum = 0;
        for(Number o: numbers){
            sum+=o.doubleValue();
        }
        return sum;
    }
}
