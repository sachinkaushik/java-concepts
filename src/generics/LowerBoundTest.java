package generics;

import java.util.List;

/*
    Lower Bound Wildcard (? super T)
    Use Case: When you need to add elements to a collection.

    Example: Adding employees to a list that can accept any superclass of Manager.

    Scenario: You want to add Manager objects to a
    collection that can hold Employee, Person, or Object.
 */
public class LowerBoundTest {
    /*
        HERE WE CANT USE SUPER CLASS OF INTEGER, BUT CANT USE SUB CLASS OF INTEGER

     */
    public static void print(List<? super Integer> list){
        for (Object o : list){
            System.out.println(o);
        }
    }
}
