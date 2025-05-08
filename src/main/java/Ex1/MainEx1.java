package Ex1;

public class MainEx1 {
    public static void main(String[] args) {
        Person p = new Person("Marc", "Marquez", 30);

        GenericMethods.printThree("Fix", p, 42);
        System.out.println("---");
        GenericMethods.printThree("Text", 3.14, p);
    }
}