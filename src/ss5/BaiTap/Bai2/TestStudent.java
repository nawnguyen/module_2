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

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }
}

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("Student info: ");
        System.out.println("Name: " + student.getName());
        System.out.println("Class: "+ student.getClasses());

        student.setName("Nam");
        student.setClasses("C03");

        System.out.println("New student info: ");
        System.out.println("Name: " + student.getName());
        System.out.println("Class: " + student.getClasses());
    }
}
