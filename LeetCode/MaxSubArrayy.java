import java.util.Scanner;

public class MaxSubArrayy {
    public static int maxSubArray(int[] nums) {
        int n=nums.length;
        int maks=nums[0];
        int curr=nums[0];
        for(int i=1;i<n;i++){
            if(curr<0){
                curr=0;
            }
            curr+=nums[i];
            maks=Math.max(maks,curr);
            
        }
        return maks;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(maxSubArray(arr));
        sc.close();
    }
}
