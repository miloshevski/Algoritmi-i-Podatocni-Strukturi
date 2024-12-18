package ZadaciOdKurs;

import java.util.Scanner;

public class wowww {
    public static int count(String s){
        int n=s.length();
        int [] dp=new int[n];
        if(s.charAt(0)=='w'){
            dp[0]=1;
        }
        for(int i=1;i<n;i++){
            if(s.charAt(i)=='w'){
                dp[i]=dp[i-1]+1;
            }else{
                dp[i]=dp[i-1];
            }
        }
        int sum=0;
        int vkupno=dp[n-1];
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='o'){
                if(dp[i-1]!=vkupno){
                    sum+=dp[i-1]*(vkupno-dp[i-1]);
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(count(s));
    }
}
