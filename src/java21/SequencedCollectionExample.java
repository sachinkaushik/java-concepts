package java21;

import java.util.ArrayList;
import java.util.List;
import java.util.SequencedCollection;

public class SequencedCollectionExample {

    public static void main(String[] args) {
        // Example of using SequencedCollection
        //SequencedCollection<String> sequencedCollection = new SequencedCollection<>();
        List<String> sequencedCollection = new ArrayList<>();
        sequencedCollection.add("First");
        sequencedCollection.add("Second");
        sequencedCollection.add("Third");

        System.out.println("Sequenced Collection: " + sequencedCollection);

        System.out.println(sequencedCollection.getFirst());
    }
}
