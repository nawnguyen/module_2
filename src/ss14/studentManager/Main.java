package ss14.studentManager;

import ss14.studentManager.controller.StudentController;
import ss14.studentManager.model.Student;
import ss14.studentManager.view.StudentView;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(3, "Chuối"));
        students.add(new Student(2, "Ổi"));
        students.add(new Student(5, "Chuối"));
        students.add(new Student(1, "Xoài"));

        StudentView view = new StudentView();
        StudentController controller = new StudentController(students, view);

        System.out.println("Before sorting:");
        controller.displayStudents();

        controller.sortStudentsByNameThenId();

        System.out.println("\nAfter sorting by name then ID:");
        controller.displayStudents();
    }
}

