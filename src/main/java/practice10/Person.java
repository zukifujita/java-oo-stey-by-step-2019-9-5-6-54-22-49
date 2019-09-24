package practice10;

public class Person {
    private int id;
    private String name;
    private int age;
    private String result;

    Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return this.id;
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

    @Override
    public boolean equals(Object o) {
        Person person = (Person) o;
        if (o instanceof Person) {
            return getId() == person.id;
        }

        return false;
    }
}
