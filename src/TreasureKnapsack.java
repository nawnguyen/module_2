import java.util.*;

public class TreasureKnapsack {

    public static void main(String[] args) {
        // Nhập dữ liệu ví dụ
        int n = 4; // số lượng kho báu
        int T = 5; // giới hạn thời gian
        int[] time = {2, 3, 4, 5};  // thời gian nhặt mỗi kho báu
        int[] value = {3, 4, 5, 6}; // điểm tương ứng

        knapsack(n, T, time, value);
    }

    public static void knapsack(int n, int T, int[] time, int[] value) {
        // dp[i][j] là điểm lớn nhất với i kho báu và thời gian j
        int[][] dp = new int[n + 1][T + 1];

        // Quy hoạch động
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= T; j++) {
                if (time[i - 1] <= j) {
                    dp[i][j] = Math.max(dp[i - 1][j],
                            dp[i - 1][j - time[i - 1]] + value[i - 1]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        // Kết quả
        System.out.println("Tổng điểm lớn nhất: " + dp[n][T]);

        // Truy vết các kho báu được chọn
        List<Integer> selected = new ArrayList<>();
        int i = n, j = T;
        while (i > 0 && j > 0) {
            if (dp[i][j] != dp[i - 1][j]) {
                selected.add(i); // lưu chỉ số (bắt đầu từ 1)
                j -= time[i - 1];
            }
            i--;
        }

        Collections.reverse(selected);
        System.out.print("Các kho báu được chọn: ");
        for (int index : selected) {
            System.out.print(index + " ");
        }
        System.out.println();
    }
}
