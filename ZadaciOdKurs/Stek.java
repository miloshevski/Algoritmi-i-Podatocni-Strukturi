package ZadaciOdKurs;
import java.util.Scanner;
import java.util.Stack;
public class Stek {
    public static boolean checkParathesis(String s){
        int n=s.length();
        Stack<Character>stack=new Stack<>();
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            if(c=='('||c=='['||c=='{'){
                stack.push(c);
            }else if(c==')'||c==']'||c=='}'){
                if(stack.isEmpty()){
                    return false;
                }
                char p=stack.pop();
                if((c==')'&&p!='(')||(c=='}'&&p!='{')||(c==']'&&p!='[')){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer>stack=new Stack<>();
        String s="(2+3)+{2*(3+4";
        if(checkParathesis(s)){
            System.out.println("valid");
        }else{
            System.out.println("invalid");
        }
    }
}
