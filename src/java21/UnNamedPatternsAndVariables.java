package java21;

public class UnNamedPatternsAndVariables {

    public static void main(String[] args) {
        try{
            int a = 5/0;
        //}catch (ArithmeticException e){ variable e is not being used so we can
        }catch (ArithmeticException _){//write like this in java 21
            System.out.println("Error");
        }
    }
}
