package practice11;

public class Klass {
    public int number;
    public String teacherName;
    private Student leader;
    private Student member;
    private String result;

    Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }

    public String getDisplayName() {
        result = "Class " + this.number;
        return result;
    }

    public Student assignLeader(Student student) {
        if (student.getKlass().getNumber() != getNumber()) {
            System.out.print("It is not one of us.\n");
        } else if (student.getKlass().getNumber() == getNumber()) {
            System.out.print("I am " + teacherName + ". I know " + student.getName() + " become Leader of Class 2.\n");
            this.leader = student;
        }

        return getLeader();
    }

    public Student getLeader() {
        return leader;
    }

    public Student appendMember(Student student) {
        System.out.print("I am " + teacherName + ". I know " + student.getName() + " has joined Class " + getNumber() + ".\n");
        student.klass.number = number;
        this.member = student;
        return member;
    }
}
