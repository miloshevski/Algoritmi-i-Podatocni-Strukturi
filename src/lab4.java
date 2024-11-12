

import java.util.Scanner;

public class lab4 {

    public static int binarySearch(int arr[], int low, int high, int x)
    {
        if(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==x){
                return mid;
            }
            if(arr[mid]<x){
                return binarySearch(arr, mid+1, high, x);
            }
            return binarySearch(arr, low, mid-1, x);
        }
        return -1;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int m = sc.nextInt();
        int index=binarySearch(arr, 0, n-1, m);
        if(index==-1){
            System.out.println("Ne postoi");
        }else{
            System.out.println(index);
        }
        sc.close();
    }
}
