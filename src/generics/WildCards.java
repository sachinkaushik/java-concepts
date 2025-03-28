package generics;

import java.util.List;

/*
    In Java generics, wildcards (?) are a special kind of type
    argument that can be used in method arguments or class definitions to represents an
    unknown type. They allow for more flexible and dynamic code by letting the type be specified
    later or be more loosely defined
 */
public class WildCards {


    /*
        HERE IN THIS METHOD WE ARE JUST READING THE DATA, NT DOING ANY OTHER OPERATIONS
        SO BELOW METHOD CAN BE REPLACED WITH WILDCARDS as SHOWN IN PRINTS() METHOD
     */
    public <T> void print1(List<T> list){
        for(T t : list){
            System.out.println(t);
        }
    }

    /*
        WE DON'T CARE IF ANYTHING COMES HERE, AS WE ARE JUST READING/PRINTING
     */
    public  void print2(List<?> list){
        for(Object t : list){
            System.out.println(t);
        }
    }

    /*
      IF WE HAVE TO RETURN THE VALUE LIKE BELOW METHOD, THEN TYPE SAFETY PROBLEM ARISES HERE
      SO IN THIS CASE WE CAN USE <T> OR WHEN WE HAVE TO RETURN THE VALUE THEN WE CAN USE <T>
      AND WHEN WE ARE DOING READ ONLY WORK THEN WE CAN USE WILDCARDS
     */
    public  Object print3(List<?> list){
        return list.get(0);
    }

    /*
    SO IN CASE OF RETURN , WE CAN USE TYPE <T>, LIKE WE ARE USING IN BELOW METHOD
     */
    public  <T> T print4(List<T> list){
        return list.get(0);
    }

    /*
    IN BELOW METHOD WE UPDATING/ADDING THE LIST, SO ITS NOT READ ONLY WORK, SO WE CANT USE
    WILDCARD IN BELOW METHODS
     */
    public <T> void copy(List<T> source, List<T> destination){
        for(T item : source){
            destination.add(item);
        }
    }
}
