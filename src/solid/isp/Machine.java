package solid.isp;

/*
    "No client should be forced to depend on methods it does not use."

    USE CASE : You have a large interface with many methods.
        Some classes implementing it may not need all methods.
 */
public interface Machine {
    void print();
    void scan();
    void fax();

}

class SimplePrinter implements Machine {
    public void print() { System.out.println("Printing..."); }
    public void scan() { throw new UnsupportedOperationException(); }
    public void fax() { throw new UnsupportedOperationException(); }
}
