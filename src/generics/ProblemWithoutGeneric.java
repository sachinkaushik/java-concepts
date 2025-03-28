package generics;

import java.util.ArrayList;

public class ProblemWithoutGeneric {

    /*
        Type safety problem is below code as we are adding string integer boolean in list
        manual casting
        no compile time checking

        These issues can be solved by Generics
     */
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(12);
        list.add(true);
        list.add("abc");

        Integer abc = (Integer)list.get(1); // her eis problem at runtime

    }
}
