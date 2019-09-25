package practice11;

import java.util.LinkedList;

public class Teacher extends Person{
    private int id;
    private String name;
    private int age;
    private String result;
    private Klass klass;
    LinkedList<Klass> linkedList;

    Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    Teacher(int id, String name, int age, LinkedList<Klass> linkedList) {
        super(id, name, age);
        this.linkedList = linkedList;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Klass getKlass() {
        return this.klass;
    }

    @Override
    public String introduce() {
        if (klass == null && linkedList == null) {
            result = super.introduce() + " I am a Teacher. I teach No Class.";
        } else if (klass == null && linkedList != null) {
            result = super.introduce() + " I am a Teacher. I teach Class ";
            for (int i = 0; i < linkedList.size(); i++) {
                result += linkedList.get(i).getNumber();
                if (i != linkedList.size() - 1) {
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
        for (int i = 0; i < linkedList.size(); i++) {
            if (linkedList.get(i).getNumber() == student.getKlass().getNumber()) {
                result = super.introduce() + " I am a Teacher. I teach " + student.getName() + ".";
            } else {
                result = super.introduce() + " I am a Teacher. I don't teach " + student.getName() + ".";
            }
        }

        return result;
    }

    public LinkedList<Klass> getClasses() {
        return linkedList;
    }

    public boolean isTeaching(Student student) {
        for (int i = 0; i < linkedList.size(); i++) {
            if (linkedList.get(i).getNumber() == student.getKlass().getNumber()) {
                return true;
            }
        }
        return false;
    }
}
