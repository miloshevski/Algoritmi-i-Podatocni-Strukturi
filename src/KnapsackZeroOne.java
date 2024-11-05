import java.util.ArrayList;
import java.util.Scanner;

public class KnapsackZeroOne {
    public static class Job{
        public int time;
        public int price;
        Job(int time,int price){
            this.time=time;
            this.price=price;
        }
    }

    public static int buildMatrix(ArrayList<Job> jobs,int m){
        int n = jobs.size();
        int [][] arr = new int[n+1][m+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=m;j++){
                if(i==0||j==0){
                    arr[i][j]=0;
                }else if(jobs.get(i-1).time>j){
                    arr[i][j]=arr[i-1][j];
                }else{
                    arr[i][j]=Math.max(arr[i-1][j],jobs.get(i-1).price+arr[i-1][j-jobs.get(i-1).time]);
                }
            }
        }
        return arr[n][m];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Job> jobs = new ArrayList<>();
        for(int i=0;i<n;i++){
            int t=sc.nextInt();
            int p=sc.nextInt();
            jobs.add(new Job(t, p));
        }
        int m=sc.nextInt();
        // int [][] arr= buildMatrix(jobs,m);
        // for (int i = 0; i <= n; i++) {
        //     for (int j = 0; j <= m; j++) {
        //         System.out.printf("%4d", arr[i][j]); // Change the width (e.g., 4) as needed
        //     }
        //     System.out.println();
        // }
        int v=buildMatrix(jobs, m);
        System.out.println("Max value is: "+ v);;
    }
}
