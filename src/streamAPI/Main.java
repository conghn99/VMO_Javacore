package streamAPI;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ManagerStudent managerStudent = new ManagerStudent();
        managerStudent.addStudent();

        Student student = managerStudent.findStudent("Vuong");
        System.out.println(student);

        List<Student> studentList1 = managerStudent.findStudentByRank("GIOI");
        System.out.println(studentList1);

        List<Student> studentList2 = managerStudent.sortStudent();
        System.out.println(studentList2);

        List<Student> studentList3 = managerStudent.findStudentByExactName("Kong");
        System.out.println(studentList3);

        List<Student> studentList4 = managerStudent.findStudentByContainName("ong");
        System.out.println(studentList4);
    }
}
