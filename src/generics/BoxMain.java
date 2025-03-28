package generics;

public class BoxMain {
    public static void main(String[] args) {
        Box box = new Box(); // this is not type safe
        box.setValue(123);
        box.setValue("123");
        String value = (String)box.getValue();
        System.out.println(box.getValue());

        BoxWithGeneric<Integer> b = new BoxWithGeneric<>(); // this is type safe
        b.setValue(123);

        System.out.println(b.getValue());
    }
}
