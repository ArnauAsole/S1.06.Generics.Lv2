package Ex2;

public class GenericMethods {
    @SafeVarargs
    public static <T> void printVararg(T... args) {
        System.out.println("Arguments:");
        for (int i = 0; i < args.length; i++) {
            System.out.println((i + 1) + ": " + args[i]);
        }
    }
}