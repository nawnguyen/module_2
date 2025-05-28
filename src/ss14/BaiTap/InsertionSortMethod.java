package ss14.BaiTap;

public class InsertionSortMethod {

    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int current = list[i];
            int j = i - 1;

            while (j >= 0 && list[j] > current) {
                list[j + 1] = list[j];
                j--;
            }

            list[j + 1] = current;
        }
    }
    public static void main(String[] args) {
        int[] myList = {9, 5, 1, 4, 3};

        System.out.println("Before sorting:");
        printArray(myList);

        insertionSort(myList);

        System.out.println("After sorting:");
        printArray(myList);
    }

    public static void printArray(int[] list) {
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
