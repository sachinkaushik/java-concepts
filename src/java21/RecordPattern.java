package java21;

public class RecordPattern {
    public static void main(String[] args) {
        // Example of using record pattern matching
        Person person = new Person("John", 30);
        printPersonInfo(person);
    }
    /*
        before java 21, we need to use instanceof and then cast the object
     */
    public static void printPerson(Object obj){
        if (obj instanceof Person) {
            Person p = (Person) obj;
            System.out.println(p.name() + ", " + p.age());
        }
        else {
            System.out.println("Not a person");
        }
    }

    public static void printPersonInfo(Object obj) {
        if (obj instanceof Person(String name, int age)) {
            System.out.println(STR."Name: \{name}, Age: \{age}");
        } else {
            System.out.println("Not a person");
        }
    }

    /*
    Record Patterns in switch (With Type Patterns)
     */
    static String describe(Object o) {
        return switch (o) {
            case Person(String name, int age) -> STR."Person: \{name}, age \{age}";
            case null -> "Null value";
            default -> "Unknown type";
        };
    }

    record Person(String name, int age) { // record class
    }
}
