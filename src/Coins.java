import java.util.ArrayList;
import java.util.Scanner;

public class Coins {
    static int count(int coins[], int sum) {
        int n = sum + 1;
        int m = coins.length;
        int[] coinUsed = new int[n];
        int[] arr = new int[n];

        // Initialize arr[] with a large value
        for (int i = 0; i < n; i++) {
            arr[i] = sum + 1;
        }
        arr[0] = 0;

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int c = coins[j];
                if (i - c >= 0 && arr[i] > arr[i - c] + 1) {
                    arr[i] = arr[i - c] + 1;
                    coinUsed[i] = c; 
                }
            }
        }

        // Construct the list of used coins
        ArrayList<Integer> usedCoins = new ArrayList<>();
        int currentSum = sum;
        while (currentSum > 0) {
            usedCoins.add(coinUsed[currentSum]);
            currentSum -= coinUsed[currentSum];
        }
        System.out.println("Used coins: " + usedCoins);

        // If sum cannot be reached with given coins, return -1
        return arr[sum] > sum ? -1 : arr[sum];
    }

    public static void main(String[] args) {
        int[] coins = {1, 4, 9, 16, 25, 36};
        Scanner sc = new Scanner(System.in);

        while (true) {
            int sum = sc.nextInt();
            if (sum == -1) {
                break;
            }
            System.out.println("Minimum coins needed: " + count(coins, sum));
        }
        sc.close();
    }
}
