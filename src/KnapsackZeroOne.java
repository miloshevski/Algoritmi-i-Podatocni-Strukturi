import java.util.ArrayList;
import java.util.LinkedList;
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

    public static int[][] buildMatrix(ArrayList<Job> jobs,int m){
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
        return arr;
    }
    public static LinkedList<Integer> traverse(int [][] arr, int n, int m){
        LinkedList<Integer> result = new LinkedList<>();
        int current;
        for(int i=n;i>=0;i--){
            for(int j=m;j>=0;j--){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        return result;
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
        int[][] K=buildMatrix(jobs, m);
        int v=K[n][m];
        traverse(K, n, m);
        System.out.println(v);
        sc.close();
    }
}
