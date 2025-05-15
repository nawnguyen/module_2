package ss5.BaiTap.Bai2;


class Student {
    private String name = "Join";
    private String classes = "C02";

    public Student() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public void display (){
        System.out.println("Name: " + name+ " "+"Class: "+ classes);
    }
}

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("Student info: ");
        student.display();
        student.setName("Nam");
        student.setClasses("C03");

        System.out.println("New student info: ");
        student.display();
    }
}
