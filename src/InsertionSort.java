import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i]; // Lấy phần tử cần chèn
            int j = i - 1;     // Chỉ số của phần tử cuối trong phần đã sắp xếp

            // Di chuyển các phần tử lớn hơn key về phía sau
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            // Chèn key vào vị trí đúng
            array[j + 1] = key;
        }
    }

    // Hàm main để kiểm tra
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 1, 9};
        System.out.println("Mảng trước khi sắp xếp: " + Arrays.toString(array));
        insertionSort(array);
        System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(array));
    }
}