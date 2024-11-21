package ZadaciOdKurs;

import java.util.Scanner;

public class Kvadrati {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int X = input.nextInt();
        int result;
        int n = (int) Math.floor(Math.sqrt(X));
        int [] kvadrati=new int[n];
        for(int i=0;i<n;i++){
            kvadrati[i]=(i+1)*(i+1);
        }
        int [] dp=new int[X+1];
        dp[0]=0;
        for(int i=1;i<=X;i++){
            dp[i]=X+1;
        }
        for(int i=1;i<=X;i++){
            for(int j=0;j<n;j++){
                if(i-kvadrati[j]>=0){
                    dp[i]=Math.min(dp[i],dp[i-kvadrati[j]]+1);
                }
            }
        }
        System.out.println(dp[X]);
    }
}
