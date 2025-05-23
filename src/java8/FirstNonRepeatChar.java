package java8;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatChar {
    public static void main(String[] args) {
        String input = "Java articles are Awesome";
        Character c = input.chars().mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s)))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1L)
                .map(enntry -> enntry.getKey())
                .findFirst()
                .get();

        System.out.println(c);

    }
}
