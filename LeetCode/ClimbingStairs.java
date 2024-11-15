import java.util.Scanner;

public class ClimbingStairs {
    public static int climbStairs(int n) {
        int []stairs= new int[n+1];
        stairs[0]=1;
        stairs[1]=1;
        for(int i=2;i<=n;i++){
            stairs[i]=stairs[i-2]+stairs[i-1];
        }
        return stairs[n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(climbStairs(n));
        sc.close();
    }
}
