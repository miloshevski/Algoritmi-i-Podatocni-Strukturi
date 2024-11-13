import java.util.Scanner;

public class MaxProductDP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] dp = new int[n];
        dp[0] = arr[0];
        int globalMax = dp[0];

        for (int i = 1; i < n; i++) {
            dp[i] = arr[i];
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j]) {
                    dp[i] = Math.max(dp[i], dp[j] * arr[i]);
                }
            }
            globalMax = Math.max(globalMax, dp[i]);
        }

        System.out.println(globalMax);
        sc.close();
    }
}
