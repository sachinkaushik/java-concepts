package generics;

/*
    this <T> could be anything, I mean we can write <A> also, there is no problem with this
    <T> is just a convention
 */
public class BoxWithGeneric<T> {
//public class BoxWithGeneric<A> {

    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
