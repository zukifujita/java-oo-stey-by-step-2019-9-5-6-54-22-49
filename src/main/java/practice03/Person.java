package practice03;

public class Person {
    private String name;
    private int age;
    private String result;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String introduce() {
        result = "My name is " + this.name + ". I am " + this.age + " years old.";
        return result;
    }
}
