package practice10;

import java.util.LinkedList;

public class Teacher extends Person {
    private int id;
    private String name;
    private int age;
    private String result;
    private Klass klass;
    LinkedList<Klass> klass2;

    Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    Teacher(int id, String name, int age, LinkedList<Klass> linkedList) {
        super(id, name, age);
        this.klass2 = linkedList;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Klass getKlass() {
        return this.klass;
    }

    @Override
    public String introduce() {
        if (klass == null && klass2 == null) {
            result = super.introduce() + " I am a Teacher. I teach No Class.";
        } else if (klass == null && klass2 != null) {
            result = super.introduce() + " I am a Teacher. I teach Class ";
            for (int i = 0; i < klass2.size(); i++) {
                result += klass2.get(i).getNumber();
                if (i != klass2.size() - 1) {
                    result += ", ";
                } else {
                    result += ".";
                }
            }
        } else {
            result = super.introduce() + " I am a Teacher. I teach Class " + klass.getNumber() + ".";
        }

        return result;
    }

    public String introduceWith(Student student) {
        for (int i = 0; i < klass2.size(); i++) {
            if (klass2.get(i).getNumber() == student.getKlass().getNumber()) {
                result = super.introduce() + " I am a Teacher. I teach " + student.getName() + ".";
            } else {
                result = super.introduce() + " I am a Teacher. I don't teach " + student.getName() + ".";
            }
        }

        return result;
    }

    public LinkedList<Klass> getClasses() {
        return klass2;
    }

    public boolean isTeaching(Student student) {
        for (int i = 0; i < klass2.size(); i++) {
            if (klass2.get(i).getNumber() == student.getKlass().getNumber()) {
                return true;
            }
        }
        return false;
    }
}