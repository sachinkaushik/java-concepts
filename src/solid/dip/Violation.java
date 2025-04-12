package solid.dip;

class MySQLDatabase {
    void connect() {
        System.out.println("Connecting to MySQL database...");
    }
}

class UserServic {
    MySQLDatabase db = new MySQLDatabase(); // tightly coupled
}

public class Violation {
}
