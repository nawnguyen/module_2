package ss14.studentManager.service;

import ss14.studentManager.model.Student;
import ss14.studentManager.repository.StudentRepository;

import java.util.Comparator;
import java.util.List;

public class StudentService {
    private StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public List<Student> getSortedStudents() {
        List<Student> students = repository.findAll();
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int nameCompare = s1.getName().compareToIgnoreCase(s2.getName());
                if (nameCompare != 0) {
                    return nameCompare;
                }
                return Integer.compare(s1.getId(), s2.getId());
            }
        });
        return students;
    }
}
