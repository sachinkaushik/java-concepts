package generics;

public class BoundedTypeParam<T extends Number> {

    private T val;

    public T getVal() {
        return val;
    }

    public void setVal(T val) {
        this.val = val;
    }

    public static void main(String[] args) {
        //BoundedTypeParam<String> b = new BoundedTypeParam<String>(); // this we cant do as
        //bounded type is Number, so it could be only Integer etc...
        BoundedTypeParam<Integer> c = new BoundedTypeParam<>();
    }
}
