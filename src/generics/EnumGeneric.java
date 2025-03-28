package generics;

enum Operation{
    ADD, SUBTRACT, MULTIPLY, DIVIDE;

    /*
    this how we can write a generic method in enum
     */
    public <T extends Number> double apply(T a, T b){
        double result = switch (this){
            case ADD -> a.doubleValue() + b.doubleValue();
            case SUBTRACT -> a.doubleValue() - b.doubleValue();
            case MULTIPLY -> a.doubleValue() * b.doubleValue();
            case DIVIDE -> a.doubleValue() / b.doubleValue();
            default -> throw new AssertionError("Unknown Operation" +this);
        };
        return result;
    }
}
public class EnumGeneric {
    public static void main(String[] args) {
        System.out.println(Operation.ADD.apply(12.125, .5));
        System.out.println(Operation.SUBTRACT.apply(25.5,12.5));
        System.out.println(Operation.MULTIPLY.apply(10, 10));
        System.out.println(Operation.DIVIDE.apply(12, 4));
    }
}
