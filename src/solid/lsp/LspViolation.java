package solid.lsp;

/*
    Definition:

    "Objects of a superclass should be replaceable with objects of its subclasses
    without altering the correctness of the program."

    Use Case:

    You have a method that accepts a base class.
    You should be able to pass any subclass without breaking the behavior.
 */
interface Bird{
    void fly();
}
class Gorraiya implements Bird {

    @Override
    public void fly() {
        System.out.println(" Hey I can fly....");
    }
}
class Ostritch implements Bird {

    /*
    Now if you pass an Ostrich to a method expecting a Bird,
    it might crash when fly() is called. That's a LSP violation.
     */
    @Override
    public void fly() {
        System.out.println("Hey , I can't fly........ :( ");
        throw new UnsupportedOperationException("Hey , I can't fly........ :( ");
    }
}

public class LspViolation {

    public static void main(String[] args) {
        Bird gorraiya = new Gorraiya();
        gorraiya.fly();
        Bird ostritch = new Ostritch();
        ostritch.fly(); // here
    }
}
