package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
    Given a list of integers,
    find out all the even numbers that exist in the list using Stream functions?
 */
public class EvenNo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 15, 8, 49, 25, 98, 32);

        List<Integer> list1 = list.stream().filter(n -> n % 2 == 0).toList();
        
        //when numbers of array is given
        int[] arr = {3,6,1,9,6,8,10};
        Map<Boolean, List<Integer>> collect = Arrays.stream(arr).boxed()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
    }
}
