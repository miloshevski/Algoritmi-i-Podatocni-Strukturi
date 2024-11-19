package ZadaciOdKurs;

import java.util.Scanner;
import java.util.Stack;
public class Matematika {
    static int prec(char c) {
        if (c == '^')
            return 3;
        else if (c == '/' || c == '*')
            return 2;
        else if (c == '+' || c == '-')
            return 1;
        else
            return -1;
    }
    static boolean isOperator(char c){
        if(c=='+'||c=='-'||c=='/'||c=='*'){
            return true;
        }
        return false;
    }

    static String postFix(String s){
        Stack<Character> st = new Stack<>();
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9')){
                result+=c;
            }
            else if (c == '('){
                st.push('(');
            }
            else if (c == ')') {
                while (st.peek() != '(') {
                    result+=st.pop();
                }
                st.pop(); 
            }
            else {
                while (!st.isEmpty() && ( prec(c) < prec(st.peek()) || prec(c) == prec(st.peek()) ) ) {
                    result+=st.pop();
                }
                st.push(c);
            }
        }
        while (!st.isEmpty()) {
            result+=st.pop();
        }
        return result;
    }
    static int evaluatePostFix(String s){
        int n=s.length();
        Stack<Integer> res = new Stack<>();
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                res.push(c-'0');
            }else if(isOperator(c)){
                int b=res.pop();
                int a = res.pop();
                if(c=='+'){
                    res.push(a+b);
                }else if(c=='-'){
                    res.push(a-b);
                }else if(c=='*'){
                    res.push(a*b);
                }else if(c=='/'){
                    res.push(a/b);
                }
            }
        }
        return res.pop();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s="2+3*(5+1)";
        System.out.println(evaluatePostFix(postFix(s)));
        sc.close();
    }
}
