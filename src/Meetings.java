import java.util.Scanner;

public class Meetings{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] pocetok= new int[n];
        int [] kraj = new int[n];
        for(int i=0;i<n;i++){
            pocetok[i]=sc.nextInt();
            kraj[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(pocetok[j]>pocetok[j+1]){
                    int tmp=pocetok[j];
                    pocetok[j]=pocetok[j+1];
                    pocetok[j+1]=tmp;
                }
            }
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(kraj[j]>kraj[j+1]){
                    int tmp=kraj[j];
                    kraj[j]=kraj[j+1];
                    kraj[j+1]=tmp;
                }
            }
        }
        int i=0,j=0;
        int curr=0,max=0;
        while(i<n&&j<n){
            if(pocetok[i]<kraj[j]){
                curr++;
                i++;
                max=Math.max(curr, max);
            }else{
                curr--;
                j++;
            }
        }
        System.out.println(max);
    }
}