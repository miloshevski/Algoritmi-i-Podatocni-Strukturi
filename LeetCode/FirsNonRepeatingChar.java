import java.util.Scanner;

public class FirsNonRepeatingChar {
    public static int firstUniqChar(String s) {
        int [] arr=new int[26];
        int n=s.length();
        char c;
        for(int i=0;i<n;i++){
            c = s.charAt(i);
            arr[c-'a']++;
        }
        for(int i=0;i<n;i++){
            c=s.charAt(i);
            if(arr[c-'a']==1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s =sc.nextLine();
        System.out.println(firstUniqChar(s));
    }
}
