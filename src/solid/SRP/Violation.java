package solid.SRP;

public class Violation {
}
class Invoice {
    public void calculateTotal() {
        System.out.println("Calculating total...");
    }
    public void printInvoice() {
        System.out.println("Printing invoice...");
    }          // Printing logic in same class
    public void saveToDatabase() {
        System.out.println("Saving to database...");
    }        // DB logic in same class
}
