package solid.isp;

interface Printer {
    void print();
}

interface Scanner {
    void scan();
}

interface Fax {
    void fax();
}

class SimplePrinterr implements Printer {
    public void print() { System.out.println("Printing..."); }
}

public class Solution {
}
