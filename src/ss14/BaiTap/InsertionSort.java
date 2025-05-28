package ss14.BaiTap;

public class InsertionSort {

    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 2, 1};

        System.out.println("Mảng gốc:");
        printArray(numbers);

        insertionSort(numbers);
    }

    public static void insertionSort(int[] numbers) {
        for (int currentIndex = 1; currentIndex < numbers.length; currentIndex++) {
            int valueToInsert = numbers[currentIndex];
            int previousIndex = currentIndex - 1;

            while (previousIndex >= 0 && numbers[previousIndex] > valueToInsert) {
                numbers[previousIndex + 1] = numbers[previousIndex];
                previousIndex--;
            }

            numbers[previousIndex + 1] = valueToInsert;

            System.out.print("Bước " + currentIndex + ": ");
            printArray(numbers);
        }
    }

    public static void printArray(int[] numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
