package java8;

import java.util.Arrays;
import java.util.List;

public class NumberStartingWith {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32,19);

        List<String> list = myList.stream().map(String::valueOf).filter(n -> n.startsWith("1")).toList();
        System.out.println(list);
    }
}
