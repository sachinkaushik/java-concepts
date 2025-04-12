package solid.ocp;

public class Solution {
    // Open/Closed Principle (OCP) states that software entities should be open for extension but closed for modification.
    // This means that the behavior of a module can be extended without modifying its source code.
    // In this example, we can add new discount types without modifying the Discount class.
}
interface DiscountStrategy {
    double apply(double amount);
}

class FestivalDiscount implements DiscountStrategy {
    public double apply(double amount) { return amount * 0.9; }
}

class ClearanceDiscount implements DiscountStrategy {
    public double apply(double amount) { return amount * 0.5; }
}

