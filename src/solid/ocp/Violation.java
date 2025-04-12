package solid.ocp;
// The Open/Closed Principle (OCP) states that software entities (classes, modules, functions, etc.)
// should be open for extension but closed for modification.
// This code violates the Open/Closed Principle (OCP) because the Discount class is not open for extension.


class Discount {
    public double apply(String type, double amount) {
        if (type.equals("FESTIVAL")) return amount * 0.9;
        else if (type.equals("CLEARANCE")) return amount * 0.5;
        return amount;
    }
}

public class Violation {
}
