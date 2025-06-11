package caseStudy.repository;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {

    public static <T> List<T> readFromFile(String path) {
        File file = new File(path);
        if (!file.exists()) {
            System.out.println("File không tồn tại: " + path);
            return new ArrayList<>();
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            return (List<T>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Lỗi khi đọc file: " + path);
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    public static <T> void writeToFile(String path, List<T> list) {
        File file = new File(path);
        File parentDir = file.getParentFile();

        if (parentDir != null && !parentDir.exists()) {
            if (parentDir.mkdirs()) {
                System.out.println("Đã tạo thư mục: " + parentDir.getAbsolutePath());
            } else {
                System.err.println("Không thể tạo thư mục: " + parentDir.getAbsolutePath());
            }
        }

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(list);
        } catch (IOException e) {
            System.err.println("Lỗi khi ghi file: " + path);
            e.printStackTrace();
        }
    }
}
