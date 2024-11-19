package ZadaciOdKurs;

import java.util.Scanner;
import java.util.Stack;
public class ShittyLanguage{
    public static boolean matches(String a,String b){
        if(b.equals("end"+a)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> stack =new Stack<>();
        Stack<String>tmp=new Stack<>();
        String input;
        boolean flag=false;
        while (true) {
            input=sc.nextLine();
            if(input.equals("x")){
                break;
            }
            else if(input.startsWith("func")){
                stack.push(input);
            }else if(input.startsWith("end")){
                if(stack.isEmpty()){
                    flag=true;
                    break;
                }
                if(!matches(stack.pop(), input)){
                    break;
                }
            }
        }
        if(stack.isEmpty()&&!flag){
            System.out.println("Valid");
        }else{
            System.out.println("Invalid");
        }
    }
}