package caseStudy;


import caseStudy.controller.MainController;

public class Main {
    public static void main(String[] args) {
        System.out.println("Khởi động hệ thống quản lý vé xe...");
        MainController mainController = new MainController();
        mainController.run();
    }
}

