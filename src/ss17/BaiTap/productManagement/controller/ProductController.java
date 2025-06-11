package ss17.BaiTap.productManagement.controller;

import ss17.BaiTap.productManagement.model.Product;
import ss17.BaiTap.productManagement.service.ProductService;
import ss17.BaiTap.productManagement.service.ProductServiceImpl;
import ss17.BaiTap.productManagement.view.ProductView;

import java.util.List;

public class ProductController {
    private final ProductService service = new ProductServiceImpl();
    private final ProductView view = new ProductView();

    public void run() {
        while (true) {
            int choice = view.showMenu();
            switch (choice) {
                case 1 -> addProduct();
                case 2 -> displayProducts();
                case 3 -> searchById();
                case 4 -> searchByName();
                case 0 -> { return; }
                default -> view.showMessage("Sai lựa chọn.");
            }
        }
    }

    private void addProduct() {
        Product p = view.inputProduct();
        service.add(p);
        view.showMessage("Đã thêm.");
    }

    private void displayProducts() {
        List<Product> list = service.getAll();
        view.displayList(list);
    }

    private void searchById() {
        String id = view.inputId();
        List<Product> result = service.searchById(id);
        view.displayList(result);
    }

    private void searchByName() {
        String name = view.inputName();
        List<Product> result = service.searchByName(name);
        view.displayList(result);
    }
}
