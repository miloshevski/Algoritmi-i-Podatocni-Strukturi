import java.util.Scanner;

public class longestPalindrome {
    public static String helper(String str, int left, int right) {
        while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
            left--;
            right++;
        }
        return str.substring(left + 1, right);
    }
    

    public static String longestPalindrome(String s) {
        int n=s.length();
        String res="";
        String res2="";
        String tmp="";
        String global="";
        int maks=0;
        for(int i=0;i<n;i++){
            res=helper(s,i,i);
            res2=helper(s, i, i+1);
            if(res.length()>res2.length()){
                tmp=res;
            }else{
                tmp=res2;
            }
            if(tmp.length()>global.length()){
                global=tmp;
            }
        }
        return global;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(longestPalindrome(s));
        sc.close();
    }
}
