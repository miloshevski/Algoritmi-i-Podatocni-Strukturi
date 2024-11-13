// You are given a 0-indexed array of integers nums of length n. You are initially positioned at nums[0].
// Each element nums[i] represents the maximum length of a forward jump from index i. In other words, if you are at nums[i], you can jump to any nums[i + j] where:
// 0 <= j <= nums[i] and
// i + j < n

import java.util.Scanner;

public class JumpGame {
    public static int jump(int[] nums) {
        int n=nums.length;
        int [] dp = new int[n];
        for(int i=0;i<n;i++){
            dp[i]=n+1;
        }
        dp[0]=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(i+nums[i]>=j){
                    dp[j]=Math.min(dp[j],dp[i]+1);
                }
            }
        }   
        return dp[n-1];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(jump(arr));
    }
}
