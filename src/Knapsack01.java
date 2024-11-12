
import java.util.ArrayList;
import java.util.Scanner;

public class Knapsack01 {
    public static int [][] build(int[] p, int[] w,int m){
        int n=p.length;
        int [][] dp = new int [n+1][m+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(j>=w[i-1]){
                    dp[i][j] = Math.max(dp[i - 1][j], p[i - 1] + dp[i - 1][j - w[i - 1]]);
                }else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        for(int i=0;i<=n;i++){
            for(int j=0;j<=m;j++){
                System.out.print (dp[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println(dp[n][m]);
        return dp;
    }
    public static ArrayList<Integer> backTrack(int [][] dp,int n,int m,int [] w){
        int i=n;
        int j=m;
        ArrayList<Integer> list = new ArrayList<>();
        while(i>0&&j>0){
            if(dp[i-1][j]!=dp[i][j]){
                list.add(i-1);
                j-=w[i-1];
            }
            i--;
        }

        return list;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int [] p = new int[n];
        int [] w = new int[n];
        for(int i=0;i<n;i++){
            p[i]=sc.nextInt();
            w[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int [][] dp=build(p, w, m);
        ArrayList<Integer>objects = backTrack(dp, n, m,w);
        System.out.println(objects);
        sc.close();
    }
}
