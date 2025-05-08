package Ex1;

public class GenericMethods {
    public static <U, V> void printThree(String fixe, U b, V c) {
        System.out.println("Arguments:");
        System.out.println("1 (no generic): " + fixe);
        System.out.println("2: " + b);
        System.out.println("3: " + c);
    }
}