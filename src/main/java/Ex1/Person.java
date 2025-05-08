package Ex1;

public class Person {
    private String name;
    private String surename;
    private int age;

    public Person(String nom, String cognom, int edat) {
        this.name = nom;
        this.surename = cognom;
        this.age = edat;
    }

    @Override
    public String toString() {
        return name + " " + surename + ", " + age + " years old.";
    }
}