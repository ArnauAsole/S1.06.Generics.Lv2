# 🔗📘📚S1.06.Generics.Lv2
## Advanced Generic Method Variants in Java  

## 🧾 Exercise Description  
This set of exercises builds upon the previous work with Java generics. It focuses on method flexibility by combining generic and non-generic parameters, and by accepting variable-length generic arguments. The goal is to deepen understanding of how generics can be used in different method signatures and how they behave at runtime.

### ✅ Requirements  

**Exercise 1 – One Non-Generic Argument**  
Modify the existing `GenericMethods` class so that the first argument of the method is a fixed, non-generic `String`, and the other two parameters remain generic.  
This demonstrates that generic methods can combine fixed-type and parameterized arguments.

```java
// GenericMethods.java
public class GenericMethods {
    public static <U, V> void printThree(String fixed, U second, V third) {
        System.out.println("Arguments:");
        System.out.println("1 (non-generic): " + fixed);
        System.out.println("2: " + second);
        System.out.println("3: " + third);
    }
}
```

Example usage (Main2.java):

```
public class Main2 {
    public static void main(String[] args) {
        Persona p = new Persona("Joan", "Garcia", 30);

        GenericMethods.printThree("Fixed", p, 42);
        System.out.println("---");
        GenericMethods.printThree("Text", 3.14, p);
    }
}
```

Exercise 2 – Variable-Length Generic Arguments (Varargs)
Update the method so that it can accept any number of arguments using a generic varargs parameter. This version allows maximum flexibility with unknown argument counts.

```
// GenericMethods.java
public class GenericMethods {
    @SafeVarargs
    public static <T> void printVarargs(T... args) {
        System.out.println("Arguments:");
        for (int i = 0; i < args.length; i++) {
            System.out.println((i + 1) + ": " + args[i]);
        }
    }
}
```
🛑 @SafeVarargs is used to suppress compiler warnings related to generic array creation.

Example usage:
```
public class Main2 {
    public static void main(String[] args) {
        Persona p = new Persona("Joan", "Garcia", 30);

        GenericMethods.printVarargs(p, "Hello", 42, true);
        System.out.println("---");
        GenericMethods.printVarargs("Text", 3.14, p, 'X');
    }
}
```
### 🔨 Methods Implemented

```
// GenericMethods.java
<U, V> void printThree(String fixed, U second, V third)
<T> void printVarargs(T... args)
```

### 💻 Technologies Used

Java 17

IntelliJ IDEA (Community Edition)

No third-party libraries

JUnit 5 (optional for tests)

### 📋 Prerequisites

Java JDK 17

IntelliJ IDEA Community Edition

Git (optional for version control)

### 🛠️ Installation and Setup

Install Required Tools

Java JDK 17

IntelliJ IDEA

Clone the Repository (Optional)

bash
```
git clone https://github.com/ArnauAsole/S1.06.Generics.Lv2.git
cd S1.06.JavaGenerics.Lv2/
```
Open the Project in IntelliJ

Go to File → Open and select the project folder

### ▶️ Running the Project

Open Main2.java

Right-click the file and select Run

You’ll see the output in the terminal

### 🌐 Deployment
This is a console-based Java project for learning purposes. No deployment required.

🤝 Acknowledgements
Thanks to the contributors: Arnau, Adrià, Ignasi, Ana, Alejandro and Marc
