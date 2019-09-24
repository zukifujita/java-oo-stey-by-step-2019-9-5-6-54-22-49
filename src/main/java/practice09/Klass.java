package practice09;

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

    public Student assignLeader(Student jerry) {
        this.leader = jerry;
        if (this.leader != null) {
            getLeader();
        }

        return appendMember(jerry);
    }

    public Student getLeader() {
        return leader;
    }

    public Student appendMember(Student jerry) {
        this.member = jerry;
        return jerry;
    }
}
