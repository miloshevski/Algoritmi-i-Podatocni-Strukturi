import java.util.ArrayList;
import java.util.Scanner;

public class MaxProduct {
    public static int product(ArrayList<Integer> arr){
        int p=1;
        for(int i=0;i<arr.size();i++){
            p*=arr.get(i);
        }
        return p;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }   
        ArrayList<Integer>rastecka=new ArrayList<>();
        int maks=0;
        int globalMaks=0;
        for(int i=0;i<n;i++){
            rastecka.clear();
            rastecka.add(arr[i]);
            for(int j=i;j<n;j++){
                if(rastecka.get(rastecka.size()-1)<arr[j]){
                    rastecka.add(arr[j]);
                }
            }
            maks=product(rastecka);
            globalMaks=Math.max(maks, globalMaks);
        }
        System.out.println(globalMaks);
        sc.close();
    }
}
