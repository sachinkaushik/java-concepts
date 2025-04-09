package java8;

import java.util.Arrays;
import java.util.List;

/*
find the maximum value element present in it using Stream functions?
 */
public class FindMaxElement {

    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        Integer i = myList.stream().max(Integer::compare).get();
        System.out.println(i);
    }
}
