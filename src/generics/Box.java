package generics;

/*
    Generics types allow you to define a class interface, or method with placeholders(type parameters)
    for the data types they will work with
 */
public class Box {

    private Object value;

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
