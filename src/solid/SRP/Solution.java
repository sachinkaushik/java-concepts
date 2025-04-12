package solid.SRP;
//Subclasses should be substitutable for their base classes without altering behavior.
class Invoicee {
    public void calculateTotal() {  }
}

class InvoicePrinter {
    public void print(Invoice invoice) {
        System.out.println("Printing invoice...");
    }
}

class InvoiceRepository {
    public void save(Invoice invoice) {
        System.out.println("Saving to database...");
    }
}


public class Solution {
}
