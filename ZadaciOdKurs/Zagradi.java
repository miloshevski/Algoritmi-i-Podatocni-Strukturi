package ZadaciOdKurs;

public class Zagradi {
    public static boolean daliZagraditeSePravilni(String iskaz){
        ArrayStack<Character> stack = new ArrayStack<>(100);
        int n = iskaz.length();
        for(int i=0;i<n;i++){
            char c = iskaz.charAt(i);
            if(c=='('||c=='{'||c=='['){
                stack.push(c);
            }else if(c==')'||c==']'||c=='}'){
                if(stack.isEmpty()){
                    return false;
                }
                char a=stack.pop();
                if(!helper(c,a)){
                    return false;
                }
            }
        }
        return (stack.isEmpty());
    }
    public static boolean helper(char a, char b){
        if((a=='('&&b!=')')||(a=='['&&b!=']')||(a=='{'&&b!='}')){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String phrase = "s x ({(s - a) x (s - b)} x (s - c))";
       // String phrase = "s x (s - a) x s - b) x (s - c)";
        System.out.println(phrase + " ima "
        + (daliZagraditeSePravilni(phrase) ? "korektni" : "nekorektni")
        + " zagradi.");
        }
}
