package ss10.BaiTap;

public class MyListTest {
    public static void main(String[] args) {
        MyList<String> list = new MyList<>();

        list.add("Java");
        list.add("Python");
        list.add("C++");

        System.out.println("Danh sách ban đầu:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        list.add(1, "JavaScript");
        System.out.println("\nSau khi thêm JavaScript tại vị trí 1:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        list.remove(2);
        System.out.println("\nSau khi xóa phần tử tại vị trí 2:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("\nKiểm tra chứa 'Python': " + list.contains("Python"));
        System.out.println("Vị trí của 'C++': " + list.indexOf("C++"));
    }
}

