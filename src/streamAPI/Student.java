package streamAPI;

public class Student {
    private String name;
    private int age;
    private int math;
    private int physical;
    private int chemistry;
    private float avg;
    private String rank;

    public Student(String name, int age, int math, int physical, int chemistry) {
        this.name = name;
        this.age = age;
        this.math = math;
        this.physical = physical;
        this.chemistry = chemistry;
        this.avg = (float) (math + physical + chemistry)/3;
        if (this.avg >= 8.0) {
            this.rank = "GIOI";
        } else if (this.avg >= 6.5 && this.avg < 8.0) {
            this.rank = "KHA";
        } else if (this.avg >= 5.0 && this.avg < 6.5) {
            this.rank = "TB";
        } else {
            this.rank = "YEU";
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public void setPhysical(int physical) {
        this.physical = physical;
    }

    public void setChemistry(int chemistry) {
        this.chemistry = chemistry;
    }

    public void setAvg(float avg) {
        this.avg = avg;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public int getAge() {
        return age;
    }

    public int getMath() {
        return math;
    }

    public int getPhysical() {
        return physical;
    }

    public int getChemistry() {
        return chemistry;
    }

    public float getAvg() {
        return avg;
    }

    public String getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", math=" + math +
                ", physical=" + physical +
                ", chemistry=" + chemistry +
                ", avg=" + avg +
                ", rank='" + rank + '\'' +
                '}';
    }
}
