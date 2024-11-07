import java.util.ArrayList;
import java.util.Scanner;

public class Coins {
    static int count(int coins[],int sum){
        int n=sum+1;
        int m=coins.length;
        int [] coinUsed=new int [n];
        int [] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sum+1;
        }
        arr[0]=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int c=coins[j];
                if(i-c>=0){
                    arr[i]=Math.min(arr[i],arr[i-c]+1);
                    coinUsed[i]=c;
                }
            }
        }
        ArrayList<Integer> usedCoind= new ArrayList<>();
        int currentSum=sum;
        while(currentSum>0){
            usedCoind.add(coinUsed[currentSum]);
            currentSum-=coinUsed[currentSum];
        }
        System.out.println("Used coins " + usedCoind);
        
        System.out.println();
        return arr[n-1];
    }
    public static void main(String[] args) {
        int [] coins={1,2,5};
        Scanner sc = new Scanner(System.in);
        
        while(true){
            int sum=sc.nextInt();
            if(sum==-1){
                break;
            }
            System.out.println(count(coins, sum));
        }
        sc.close();
    }
}
