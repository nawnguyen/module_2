package ss14.studentManager.repository;

import ss14.studentManager.model.Student;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    private List<Student> studentList = new ArrayList<>();

    public StudentRepository() {
        studentList.add(new Student(2, "An"));
        studentList.add(new Student(1, "An"));
        studentList.add(new Student(3, "Binh"));
    }

    public List<Student> findAll() {
        return studentList;
    }
}
