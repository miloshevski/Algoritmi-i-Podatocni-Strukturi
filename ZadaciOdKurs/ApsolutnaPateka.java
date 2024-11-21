package ZadaciOdKurs;

import java.util.Scanner;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;
public class ApsolutnaPateka {
    public static int reverseNumer(int n){
        int num=0;
        while (n>0) {
            num*=10;
            num+=n%10;
            n/=10;
        }
        return num;
    }
    public static int checkIfNum(String s){
        int n=s.length();
        if(n==0){
            return -1;
        }
        if(s.charAt(0)!='.'){
            return -1;
        }
        int num=0;
        for(int i=1;i<n;i++){
            num*=10;
            num+=s.charAt(i)-'0';
        }
        return num;
    }
    public static String relativePath(String s){
        int n=s.length();
        String path="";
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            if(c=='/'){
                if(path.equals("")){
                    path+=c;
                }
                else if(path.charAt(path.length()-1)!='/'){
                    path+=c;
                }
            }else{
                path+=c;
            }
        }
        String [] arr = path.split("/");
        int m=arr.length;
        Stack<String>stack=new Stack<>();
        for(int i=m-1;i>=0;i--){
            int num=checkIfNum(arr[i]);
            if(num==-1){
                stack.add(arr[i]);
            }else{
                i-=num;
            }
        }
        String tmp="";
        while (!stack.isEmpty()) {
            tmp+="/"+stack.pop();
        }
        int len = tmp.length();
        StringBuilder relativePath = new StringBuilder();
        
        boolean first = true; 
        for (int i = 0; i < len; i++) {
            char ch = tmp.charAt(i);
            if (ch == '/') {
            
                if (!first && relativePath.charAt(relativePath.length() - 1) != '/') {
                    relativePath.append(ch);
                }
            } else {
                relativePath.append(ch);
                first = false; 
            }
        }
        
        if (relativePath.length() > 0 && relativePath.charAt(relativePath.length() - 1) == '/') {
            relativePath.deleteCharAt(relativePath.length() - 1);
        }
        
        return relativePath.toString();
        
    }
    public static void main(String[] args) {
        String pateka=" /abc/cde/xyz/.1/asdf/a1.b2/newdir/.2/a/";
        System.out.println(relativePath(pateka));
    }
}
