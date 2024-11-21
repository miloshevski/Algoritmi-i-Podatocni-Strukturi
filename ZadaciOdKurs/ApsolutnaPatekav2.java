package ZadaciOdKurs;
import java.util.Stack;
public class ApsolutnaPatekav2 {
    public static int chekIfNumber(String s){
        if(s.charAt(0)!='.'){
            return -1;
        }
        int num=Integer.parseInt(s.substring(1,s.length()));
        return num;
    }
    public static String relativePath(String s){
        String res="";
        int n=s.length();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(c=='/'){
                if(res.equals("")){
                    res+=c;
                }else if(res.charAt(res.length()-1)!='/'){
                    res+=c;
                }
            }else{
                res+=c;
            }
        }
        String [] arr=res.split("/");
        Stack<String> stack=new Stack<>();
        
        for(int i=arr.length-1;i>=0;i--){
            int m=chekIfNumber(arr[i]);
            if(m==-1){
                stack.push(arr[i]);
            }else{
                i-=m; // a b s d
            }
        }
        String relativePath="";
        while (!stack.isEmpty()) {
            relativePath+="/"+stack.pop();
        }

        return relativePath;
    }
    public static void main(String[] args) {
        String pateka="/abc///cde/xyz/.1/a";
         System.out.println(relativePath(pateka));
        
    }
}
