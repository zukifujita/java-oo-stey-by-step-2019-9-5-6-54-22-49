package practice04;

public class Student extends Person{
    private String name;
    private int age;
    private int klass;
    private String result;

    Student(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public int getKlass() {
        return this.klass;
    }

    @Override
    public String introduce() {
        result = super.introduce() + " I am a Student. I am at Class " + this.klass + ".";
        return result;
    }
}

