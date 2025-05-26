package ss12.BaiTap.ProductManagement;

import ss12.BaiTap.ProductManagement.controller.ProductController;
import ss12.BaiTap.ProductManagement.model.Product;
import ss12.BaiTap.ProductManagement.view.ProductView;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductView view = new ProductView();
        ProductController controller = new ProductController(view);
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Thêm sản phẩm");
            System.out.println("2. Hiển thị sản phẩm");
            System.out.println("3. Xoá sản phẩm theo ID");
            System.out.println("4. Tìm kiếm theo tên");
            System.out.println("5. Sắp xếp tăng dần theo giá");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Nhập ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nhập tên: ");
                    String name = sc.nextLine();
                    System.out.print("Nhập giá: ");
                    double price = sc.nextDouble();
                    controller.addProduct(new Product(id, name, price));
                }
                case 2 -> controller.displayAll();
                case 3 -> {
                    System.out.print("Nhập ID cần xoá: ");
                    int delId = sc.nextInt();
                    controller.deleteById(delId);
                }
                case 4 -> {
                    System.out.print("Nhập tên cần tìm: ");
                    String keyword = sc.nextLine();
                    controller.searchByName(keyword);
                }
                case 5 -> controller.sortByPriceAsc();
                case 0 -> {
                    return;
                }
                default -> System.out.println("Chọn không hợp lệ.");
            }
        }
    }
}
