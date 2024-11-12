//varijanta na problem so kusur
//za daden broj x da se najde najmal broj na kvadrati koi so odzemanje od x ke dadat 0
//ili so drugi zborovi najbal broj na broevi koi ke dadat suma x

import java.util.ArrayList;
import java.util.Scanner;

public class SquareSum {

    public static int [] findBestSum(int [] kvadrati, int[] dp,int n,int size) {

        dp[0]=0;
        ArrayList<Integer> used= new ArrayList<>();
        for(int i=0;i<=n;i++){
            for(int j=size-1;j>=0;j--){
                if(i-kvadrati[j]>=0){
                    dp[i]=Math.min(dp[i], dp[i-kvadrati[j]]+1);
                }
            }
        }
        return dp;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int size=(int)Math.floor(Math.sqrt(n));
        int [] kvadrati=new int[size];
        
        for(int i=1;i*i<=n;i++){
            kvadrati[i-1]=i*i;
        }
        int [] dp = new int[n+1];
        for(int i=0;i<=n;i++){
            dp[i]=n+1;
        }
        dp = findBestSum(kvadrati, dp, n, size);
        System.out.println(dp[n]);
    }
}
