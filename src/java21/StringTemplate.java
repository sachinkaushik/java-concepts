package java21;

import static java.lang.StringTemplate.STR;

/*
    This is PREVIEW Feature
 */
public class StringTemplate {

    public static void main(String[] args) {
        int a = 45;
        int b = 199;

        System.out.println(STR."The value of a is = \{a}");
        System.out.println(STR."The value of b is = \{b}");

        String title = "Java learning";
        String heading = "Welcome to Java";
        String body = "Hello, Please do testing";
        String txt = STR."""
                    \{title}
                    \{heading}
                    \{body}
                """;

        System.out.println(txt);
    }
}
