package practice05;

public class Worker extends Person{
    private String name;
    private int age;

    public Worker(String name, int age) {
        super(name, age);
    }

    @Override
    public String introduce() {
        String result = super.introduce() + " I am a Worker. I have a job.";
        return result;
    }
}

