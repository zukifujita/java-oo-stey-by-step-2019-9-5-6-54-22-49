package practice06;

public class Teacher extends Person {
    private String name;
    private int age;
    private int klass;
    private String result;

    Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    Teacher(String name, int age) {
        super(name, age);
    }

    public int getKlass() {
        return this.klass;
    }

    @Override
    public String introduce() {
        result = "";
        if(this.klass == 0) {
            result = super.introduce() + " I am a Teacher. I teach No Class.";
        } else {
            result = super.introduce() + " I am a Teacher. I teach Class " + this.klass + ".";
        }

        return result;
    }
}
