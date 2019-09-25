package practice11;

public class Klass {
    private int number;
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
        } else {
            this.leader = student;
        }

        return getLeader();
    }

    public Student getLeader() {
        return leader;
    }

    public Student appendMember(Student student) {
        this.member = student;
        return member;
    }
}
