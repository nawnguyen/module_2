package ss14.studentManager.controller;

import ss14.studentManager.model.Student;
import ss14.studentManager.view.StudentView;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentController {
    private List<Student> studentList;
    private StudentView view;

    public StudentController(List<Student> studentList, StudentView view) {
        this.studentList = studentList;
        this.view = view;
    }

    public void sortStudentsByNameThenId() {
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int nameCompare = s1.getName().compareToIgnoreCase(s2.getName());
                if (nameCompare != 0) {
                    return nameCompare;
                } else {
                    return Integer.compare(s1.getId(), s2.getId());
                }
            }
        });
    }

    public void displayStudents() {
        view.printStudentList(studentList);
    }
}
