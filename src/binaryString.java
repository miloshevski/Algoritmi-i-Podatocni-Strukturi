import java.util.Scanner;

public class binaryString {
    public static boolean check(String s){
        int ones=0;
        int zeroes=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                ones++;
            }else{
                zeroes++;
            }
        }
        return ones>zeroes;
    }

    public static int subStr(String s,int n){
        int size=1;
        int c=0;
        String tmp="";
        for(int i=0;i<=n;i++){
            tmp="";
            for(int j=0;j+size<=n;j++){
                tmp+=s.substring(j,j+size);
                if(check(tmp)){
                    c++;
                }
                tmp="";
            }
            size++;
        }
        return c;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String s=sc.nextLine();
        System.out.println(subStr(s, n));
        sc.close();
    }
}
