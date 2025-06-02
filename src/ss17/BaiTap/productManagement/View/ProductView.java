package ss17.BaiTap.productManagement.View;

import ss17.BaiTap.productManagement.Model.Product;

import java.util.List;
import java.util.Scanner;

public class ProductView {
    private final Scanner sc = new Scanner(System.in);

    public int showMenu() {
        System.out.println("1. Thêm sản phẩm");
        System.out.println("2. Hiển thị danh sách");
        System.out.println("3. Tìm theo mã");
        System.out.println("4. Tìm theo tên");
        System.out.println("0. Thoát");
        System.out.print("Chọn: ");
        return Integer.parseInt(sc.nextLine());
    }

    public Product inputProduct() {
        System.out.print("Mã: ");
        String id = sc.nextLine();
        System.out.print("Tên: ");
        String name = sc.nextLine();
        System.out.print("Giá: ");
        double price = Double.parseDouble(sc.nextLine());
        System.out.print("Hãng: ");
        String brand = sc.nextLine();
        return new Product(id, name, price, brand);
    }

    public void displayList(List<Product> list) {
        if (list.isEmpty()) {
            System.out.println("Không có dữ liệu.");
        } else {
            for (Product p : list) {
                System.out.println(p);
            }
        }
    }

    public String inputId() {
        System.out.print("Nhập mã: ");
        return sc.nextLine();
    }

    public String inputName() {
        System.out.print("Nhập tên: ");
        return sc.nextLine();
    }

    public void showMessage(String msg) {
        System.out.println(msg);
    }
}

