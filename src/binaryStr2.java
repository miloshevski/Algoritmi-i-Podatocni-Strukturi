import java.util.Scanner;

public class binaryStr2 {
    
    public static boolean check(String s) {
        int zeroes = 0;
        int ones = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                ones++;
            } else {
                zeroes++;
            }
        }
        return ones > zeroes;
    }

    public static int countBinary(String s) {
        int n = s.length();
        int count = 0;
        
        for(int size=1;size<=n;size++){
            for(int i=0;i+size<=n;i++){
                if(check(s.substring(i,i+size))){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(countBinary(s));
        sc.close();
    }
}
