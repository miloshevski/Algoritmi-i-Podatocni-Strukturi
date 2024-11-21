package ZadaciOdKurs;

import java.util.Scanner;

public class Sijalici {
    public static void swap(int [] a,int i,int j){
        int tmp=a[i];
        a[i]=a[j];
        a[j]=tmp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int [] ulica = new int[m];
        for(int i=0;i<n;i++){
            ulica[sc.nextInt()-1]=1;
        }
        int c=0;
        for(int i=0;i<m;i++){
            if(i+2<m&&ulica[i+2]==1){
                c++;
                i+=4;
            }else if(i+1<m&&ulica[i+1]==1){
                c++;
                i+=3;
            }else if(ulica[i]==1){
                c++;
                i+=2;
            }else{
                System.out.println("Ne moze da se osvetli");
            }
        }
        System.out.println(c);
        sc.close();
    }
}
