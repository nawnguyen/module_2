package ss14.studentManager;

import ss14.studentManager.controller.StudentController;
import ss14.studentManager.repository.StudentRepository;
import ss14.studentManager.service.StudentService;
import ss14.studentManager.view.StudentView;

public class Main {
    public static void main(String[] args) {
        StudentRepository repository = new StudentRepository();
        StudentService service = new StudentService(repository);
        StudentView view = new StudentView();
        StudentController controller = new StudentController(service, view);

        controller.displaySortedStudents();
    }
}
