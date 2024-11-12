import java.util.Scanner;

public class LightBulbs {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int m = sc.nextInt();
        int [] pozicii=new int[n];
        int [] ulica=new int[m];
        for(int i=0;i<n;i++){
            pozicii[i]=sc.nextInt();
            ulica[pozicii[i]-1]=1;
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(pozicii[j]>pozicii[j+1]){
                    int tmp=pozicii[j];
                    pozicii[j]=pozicii[j+1];
                    pozicii[j+1]=tmp;
                }
            }
        }
        int c=0;
        for(int i=0;i<m;i++){
            if(ulica[i+2]==1){
                c++;
                i+=4;
            }else if(ulica[i+1]==1){
                c++;
                i+=3;
            }else if(ulica[i]==1){
                c++;
                i+=2;
            }else{
                System.out.println("Ne moze da e osvetli celata ulica");
                break;
            }
        }
        System.out.println(c);
        sc.close();
    }   
}
