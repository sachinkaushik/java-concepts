package solid.dip;

interface Database {
    void connect();
}

class MySQLDatabases implements Database {
    public void connect() {
        System.out.println("Connecting to MySQL database...");
    }
}

class UserService {
    private Database db;
    public UserService(Database db) {
        this.db = db;
    }
}

public class Solution {
}
