import java.util.LinkedList;
import java.util.Scanner;

class Entry {
    String name;
    String phone;

    public Entry(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
}

class HashTable {
    private final int SIZE = 100;
    private LinkedList<Entry>[] table;

    public HashTable() {
        table = new LinkedList[SIZE];
        for (int i = 0; i < SIZE; i++) {
            table[i] = new LinkedList<>();
        }
    }

    private int hash(String key) {
        int hashValue = 0;
        for (char c : key.toCharArray()) {
            hashValue += c;
        }
        return hashValue % SIZE;
    }

    public void add(String name, String phone) {
        int index = hash(name);
        for (Entry entry : table[index]) {
            if (entry.name.equals(name)) {
                entry.phone = phone;
                return;
            }
        }
        table[index].add(new Entry(name, phone));
    }

    public String search(String name) {
        int index = hash(name);
        for (Entry entry : table[index]) {
            if (entry.name.equals(name)) {
                return entry.phone;
            }
        }
        return null;
    }

    public boolean delete(String name) {
        int index = hash(name);
        for (Entry entry : table[index]) {
            if (entry.name.equals(name)) {
                table[index].remove(entry);
                return true;
            }
        }
        return false;
    }

    public void displayAll() {
        boolean empty = true;
        for (LinkedList<Entry> bucket : table) {
            for (Entry entry : bucket) {
                System.out.println(entry.name + ": " + entry.phone);
                empty = false;
            }
        }
        if (empty) {
            System.out.println("Danh bạ trống.");
        }
    }
}

public class PhoneDirectory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashTable phoneBook = new HashTable();
        int choice;

        do {
            System.out.println("\n=== MENU DANH BẠ ===");
            System.out.println("1. Thêm số điện thoại");
            System.out.println("2. Tìm kiếm số theo tên");
            System.out.println("3. Xoá số theo tên");
            System.out.println("4. Hiển thị toàn bộ danh bạ");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ dòng mới

            switch (choice) {
                case 1:
                    System.out.print("Nhập tên: ");
                    String name = scanner.nextLine();
                    System.out.print("Nhập số điện thoại: ");
                    String phone = scanner.nextLine();
                    phoneBook.add(name, phone);
                    System.out.println("Đã thêm thành công.");
                    break;
                case 2:
                    System.out.print("Nhập tên cần tìm: ");
                    name = scanner.nextLine();
                    String result = phoneBook.search(name);
                    if (result != null) {
                        System.out.println("Số điện 2thoại: " + result);
                    } else {
                        System.out.println("Không tìm thấy.");
                    }
                    break;
                case 3:
                    System.out.print("Nhập tên cần xoá: ");
                    name = scanner.nextLine();
                    boolean deleted = phoneBook.delete(name);
                    System.out.println(deleted ? "Đã xoá thành công." : "Không tìm thấy.");
                    break;
                case 4:
                    System.out.println("=== DANH BẠ ===");
                    phoneBook.displayAll();
                    break;
                case 0:
                    System.out.println("Tạm biệt!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        } while (choice != 0);

        scanner.close();
    }
}
