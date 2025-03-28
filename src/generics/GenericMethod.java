package generics;

public class GenericMethod {

    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5};
        print(arr);
        String[] strArr = {"a", "b", "c"};
        print(strArr);
        print(12);
    }

    public static void print(Integer element){ //this will execute
        System.out.println("non generic----"+element);
    }
    public static  <T> void print(T element){
        System.out.println("generic----"+element);
    }
    public static  <T> void print(T[] array){
        for(T element : array){
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
