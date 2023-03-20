package streamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ManagerStudent {
    public List<Student> studentList = new ArrayList<>();

    public void addStudent() {
        studentList.add(new Student("Vuong", 20, 10, 9, 8));
        studentList.add(new Student("Kong", 20, 9, 8, 7));
        studentList.add(new Student("Dung", 20, 8, 7, 6));
        studentList.add(new Student("Doan", 20, 5, 6, 7));
        studentList.add(new Student("Dat", 20, 1, 2, 3));
        studentList.add(new Student("Long", 20, 2, 5, 3));
        studentList.add(new Student("Hieu", 20, 10, 7, 3));
        studentList.add(new Student("Hoang", 20, 6, 5, 4));
    }

    public Student findStudent(String name) {
        return studentList.stream().filter((e) -> e.getName().equals(name)).findFirst().orElseThrow();
    }

    public List<Student> findStudentByRank(String rank) {
        return studentList.stream().filter((e) -> e.getRank().equals(rank)).toList();
    }

    public List<Student> sortStudent() {
        return studentList.stream().sorted(Comparator.comparing(Student::getName).thenComparing(Student::getAvg)).toList();
    }

    public List<Student> findStudentByExactName(String name) {
        return studentList.stream().filter((e) -> e.getName().equals(name)).toList();
    }

    public List<Student> findStudentByContainName(String name) {
        return studentList.stream().filter((e) -> e.getName().contains(name)).toList();
    }
}
