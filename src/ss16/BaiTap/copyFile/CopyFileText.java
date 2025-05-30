package ss16.BaiTap.copyFile;

import java.io.*;
import java.util.Scanner;

public class CopyFileText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Nhập đường dẫn file nguồn: ");
            String sourcePath = scanner.nextLine();

            System.out.print("Nhập đường dẫn file đích: ");
            String targetPath = scanner.nextLine();

            File sourceFile = new File(sourcePath);
            File targetFile = new File(targetPath);

            if (!sourceFile.exists()) {
                System.out.println("File nguồn không tồn tại.");
                return;
            }

            if (sourceFile.getAbsolutePath().equals(targetFile.getAbsolutePath())) {
                System.out.println("File nguồn và file đích không được trùng nhau.");
                return;
            }

            if (!targetFile.exists()) {
                System.out.println("File đích đã tồn tại. Không thể ghi đè.");
                return;
            }

            int charCount = 0;

            try (
                    FileReader reader = new FileReader(sourceFile);
                    FileWriter writer = new FileWriter(targetFile)
            ) {
                int c;
                while ((c = reader.read()) != -1) {
                    writer.write(c);
                    charCount++;
                }
            }

            System.out.println("Đã sao chép thành công.");
            System.out.println("Số ký tự đã sao chép: " + charCount);

        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Lỗi khi đọc/ghi file: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Lỗi không xác định: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
