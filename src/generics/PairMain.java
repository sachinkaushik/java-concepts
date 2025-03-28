package generics;

public class PairMain {
    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<>(1,"abc");
        pair.setKey(1);
        pair.setValue("one");
    }
}
