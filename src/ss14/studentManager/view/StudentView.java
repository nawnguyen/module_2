package ss14.studentManager.view;


import ss14.studentManager.model.Student;

import java.util.List;

public class StudentView {
    public void printStudentList(List<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

