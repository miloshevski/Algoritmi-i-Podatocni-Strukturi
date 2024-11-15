import java.util.Scanner;
import java.util.Stack;

public class ValidParenthesis {
    public static boolean isValid(String s) {
        Stack<Character>stack= new Stack<>();
        for(char c : s.toCharArray()){
            if(c=='('||c=='{'||c=='['){
                stack.push(c);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                char top=stack.pop();
                if(
                    c==')'&&top!='('||
                    c=='}'&&top!='{'||
                    c==']'&&top!='['
                ){return false;}
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(isValid(s));
    }
}
