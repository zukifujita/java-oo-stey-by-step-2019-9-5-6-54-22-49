package practice05;

public class Worker extends Person{
    private String name;
    private int age;
    private String result;

    public Worker(String name, int age) {
        super(name, age);
    }

    @Override
    public String introduce() {
        result = super.introduce() + " I am a Worker. I have a job.";
        return result;
    }
}

