package generics;


class MyData{


    /*
        This is how we can make constructor generic
     */
    public <T> MyData(T val){

    }

    public <T extends Number> MyData(T val){

    }

}
public class GenericConstructor {

    public static void main(String[] args) {
        MyData data = new MyData("String");
        MyData intt = new MyData(123);
    }
}
