package solid.lsp;

interface Birds {}

interface FlyingBird {
    void fly();
}

class Sparrow implements FlyingBird {
    @Override
    public void fly() {
        System.out.println("Sparrow is flying");
    }
}

class Penguin implements Birds {
    // Penguins can't fly, so we don't implement the fly method
}

public class LspSolution {
}
