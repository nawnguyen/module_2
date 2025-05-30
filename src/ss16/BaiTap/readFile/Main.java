package ss16.BaiTap.readFile;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        String filePath = "src/ss16/BaiTap/readFile/countries.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = br.readLine()) != null) {
                Country country = parseCountry(line);
                if (country != null) {
                    System.out.println(country);
                }
            }
        } catch (IOException e) {
            System.out.println("Lỗi khi đọc file: " + e.getMessage());
        }
    }

    public static Country parseCountry(String csvLine) {
        if (csvLine == null || csvLine.trim().isEmpty()) return null;

        String[] data = csvLine.replace("\"", "").split(",");
        if (data.length != 3) return null;

        try {
            int id = Integer.parseInt(data[0].trim());
            String code = data[1].trim();
            String name = data[2].trim();
            return new Country(id, code, name);
        } catch (NumberFormatException e) {
            System.out.println("Lỗi định dạng số trong dòng: " + csvLine);
            return null;
        }
    }
}
