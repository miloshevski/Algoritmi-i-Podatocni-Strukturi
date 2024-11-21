package DP;

public class Kusur {
    public static int najmalBrojMoneeti(int [] coins, int n){
        int [] arr=new int[n+1];
        int m=coins.length;
        arr[0]=0;
        for(int i=1;i<=n;i++){
            arr[i]=n+1;
        }
        for(int i=2;i<=n;i++){
            for(int j=0;j<m;j++){
                if(i-coins[j]>=0){
                    arr[i]=Math.min(arr[i],arr[i-coins[j]]+1);
                }
            }
        }
        return arr[n];
    }
    public static void main(String[] args) {
        int [] moneti={1,2,5};
        int kusur=33;
        System.out.println(najmalBrojMoneeti(moneti, kusur));
    }
}
