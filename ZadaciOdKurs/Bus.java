package ZadaciOdKurs;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bus {

    public static int calculatePrice(int m){
        return (100+(100*(m-1)));
    }
    public static int MaxPrice(int n, int m){
        if(m==0){
            return n*100;
        }
        if(n<m){
            int p=(n-1)*100;
             p+=calculatePrice(m);
             return p;
        }else if(n>m){
            int p=calculatePrice(m);
            p+=(n-1)*100;
            return p;
        }
        return -1;
    }
    public static int MinPrice(int n, int m){
        if(n<m){
            int ostatok=m-(n-1);
            int p=(n-1)*100;
            p+=calculatePrice(ostatok);
            return p;
        }else if(n>m){
            int p=m*100;
            p+=(n-m)*100;
            return p;
        }else{
            return -1;
        }
    }
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        System.out.println(MinPrice(N, M));
        System.out.println(MaxPrice(N, M));
        br.close();
    }
    
}