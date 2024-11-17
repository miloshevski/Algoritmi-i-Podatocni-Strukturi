package ZadaciOdKurs;
import java.util.Scanner;


public class LDS {
	

	private static int najdolgaOpagackaSekvenca(int[] a) {
		int n=a.length;
        int [] dp = new int[n];
        for(int i=0;i<n;i++){
            dp[i]=1;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(a[i]<a[j]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
        }
        int maks=dp[0];
        for(int i=0;i<n;i++){
            maks=Math.max(maks, dp[i]);
        }
        return maks;
	}
	
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		int n = stdin.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = stdin.nextInt();
		}
		System.out.println(najdolgaOpagackaSekvenca(a));
        stdin.close();
	}


}
