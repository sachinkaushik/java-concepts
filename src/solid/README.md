Single Responsibility Principle (SRP)

        Definition:
        A class should have only one reason to change, meaning it should have only one job or responsibility.

        Example:
        If you have a class that handles both user authentication and user data storage, it violates SRP. Instead, you should separate these concerns into two classes.

Open/Closed Principle (OCP)

        Definition:
        Software entities (classes, modules, functions, etc.) should be open for extension but closed for modification.

        Example:
        If you have a class that calculates the area of different shapes, instead of modifying the class to add new shapes, you should extend it by creating new classes for each shape.

Liskov Substitution Principle (LSP)

        Definition:
        "Objects of a superclass should be replaceable with objects of its subclasses without altering the correctness of the program."

        Example:
        You have a method that accepts a base class. You should be able to pass any subclass without breaking the behavior.
        If class B is a subclass of class A, then we should be able to replace A with B without altering any of the desirable properties of the program.

Interface Segregation Principle (ISP)

        Definition:
        Clients should not be forced to depend on interfaces they do not use. Instead of one fat interface, multiple smaller interfaces are preferred based on groups of methods.

        Example:
        If you have a class that implements multiple interfaces, and a client only needs one of those interfaces, it should not be forced to depend on the other interfaces.

Dependency Inversion Principle (DIP)

        Definition:
        High-level modules should not depend on low-level modules. Both should depend on abstractions (e.g., interfaces). Abstractions should not depend on details. Details (concrete implementations) should depend on abstractions.

        Example:
        Instead of a class directly instantiating its dependencies, it should receive them through constructor injection or method injection.