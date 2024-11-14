import java.util.Scanner;

public class JumpGame1 {
    public static boolean canJump(int[] nums) {
        int n=nums.length;
        int []arr=new int[n];
        int index=0;
        for(int i=0;i<n;i++){
            if(i>index){
                return false;
            }
            index=Math.max(index, i+nums[i]);
            if(index>=n-1){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(canJump(arr) ? "true" : "false");

    }
}
