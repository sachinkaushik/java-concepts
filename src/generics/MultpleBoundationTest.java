package generics;

interface Printable {
    void print();
}
class MyNumber extends Number implements Printable{

    private final int val;
    public MyNumber(int val){
        this.val = val;
    }

    @Override
    public void print() {
        System.out.println("My Number is : "+val);
    }

    @Override
    public int intValue() {
        return 0;
    }

    @Override
    public long longValue() {
        return 0;
    }

    @Override
    public float floatValue() {
        return 0;
    }

    @Override
    public double doubleValue() {
        return 0;
    }
}
/*
    This is called multiple boundation
    Here first will be always class and then interface, we cant do reverse
    NOTE : in case of interface also we have to use extends like
    <T extends Printable>
 */
class MyBox<T extends Number & Printable> {

    private T item;
    public MyBox(T item){
        this.item = item;
    }
    public void display(){
        item.print();
    }
}

public class MultpleBoundationTest{

    public static void main(String[] args) {
        MyNumber number = new MyNumber(123);
        MyBox<MyNumber> box = new MyBox<>(number);
        box.display();
    }
}
