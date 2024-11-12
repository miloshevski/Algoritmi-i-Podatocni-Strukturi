import java.util.ArrayList;
import java.util.Scanner;

public class Kusur {

    static void Vrati(int [] coins,int sum){
        int n=sum+1;
        int m=coins.length;
        int arr[] = new int[n];
        int [] usedCoin=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=n;
        }
        arr[0]=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int c=coins[j];
                if(i-c>=0){
                    arr[i]=Math.min(arr[i],arr[i-c]+1);
                    usedCoin[i]=c;
                }
            }
        }
        ArrayList<Integer> usedCoins=new ArrayList<>();
        int currentSum=sum;
        while(currentSum>0){
            usedCoins.add(usedCoin[currentSum]);
            currentSum-=usedCoin[currentSum];
        }
        System.out.println("Coins used "+ usedCoins);
        System.out.println(arr[n-1]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] coins={1,4,9,16,25,36,49,64};
        while(true){
            int s=sc.nextInt();
            if(s<0){
                break;
            }
            Vrati(coins, s);
        }

        sc.close();
    }
}
