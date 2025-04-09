package java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
How to find duplicate elements in a given integers list in java using Stream functions?
 */
public class DuplicateElement {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        List<Integer> list = myList.stream().distinct().toList();
        System.out.println(list);

        Set<Integer> set = new HashSet<>();
        //using hashset approach
        List<Integer> list1 = myList.stream().filter(n -> !set.add(n)).toList();
        System.out.println(list1);
    }
}
