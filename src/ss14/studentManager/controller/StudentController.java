package ss14.studentManager.controller;

import ss14.studentManager.model.Student;
import ss14.studentManager.service.StudentService;
import ss14.studentManager.view.StudentView;

import java.util.List;

public class StudentController {
    private StudentService service;
    private StudentView view;

    public StudentController(StudentService service, StudentView view) {
        this.service = service;
        this.view = view;
    }

    public void displaySortedStudents() {
        List<Student> students = service.getSortedStudents();
        view.printStudentList(students);
    }
}
