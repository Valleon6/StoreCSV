package Models;

public class Applicant {
    private int age;
    private String name;
    private int testScore;

    public Applicant(int age, String name, int testScore) {
        this.age = age;
        this.name = name;
        this.testScore = testScore;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTestScore() {
        return testScore;
    }

    public void setTestScore(int testScore) {
        this.testScore = testScore;
    }
}
