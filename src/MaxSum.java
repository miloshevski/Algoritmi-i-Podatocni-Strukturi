import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MaxSum {
    public static class Pair{
        public int i;
        public int j;
        Pair(int i, int j){
            this.i=i;
            this.j=j;
        }
        public void print(){
            System.out.println("("+ i+ "," +j+")");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int [][]arr= new int [n][m];
        ArrayList<Pair> indeksi= new ArrayList<>();
        Random rand= new Random();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=rand.nextInt(10);
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        for(int i=1;i<n;i++){
            arr[i][0]+=arr[i-1][0];
        }
        for(int i=1;i<m;i++){
            arr[0][i]+=arr[0][i-1];
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(arr[n-1][m-1]);
        int i=n-1;
        int j=m-1;
        indeksi.add(new Pair(i,j));
        while(i>0||j>0){
            indeksi.addFirst(new Pair(i, j));
            if(i==0){
                j--;
            }
            else if(j==0){
                i--;
            }
            else if(arr[i-1][j]>arr[i][j-1]){
                i--;
            }else{
                j--;
            }
        }
        for(Pair p :indeksi){
            p.print();
        }
        sc.close();
    }
    
}
