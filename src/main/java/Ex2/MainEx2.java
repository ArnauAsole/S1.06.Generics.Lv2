package Ex2;

public class MainEx2 {
    public static void main(String[] args) {
        Person p = new Person("Marc", "Marquez", 30);

        GenericMethods.printVararg(p, "Hi", 42, true);
        System.out.println("---");
        GenericMethods.printVararg("Text", 3.14, p, 'X');
    }
}