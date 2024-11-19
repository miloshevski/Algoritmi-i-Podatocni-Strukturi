import java.util.Stack;

public class ReversePolishNotation {
    public static int evalRPN(String[] tokens) {
        Stack<Integer>st=new Stack<>();
        int n=tokens.length;
        for(int i=0;i<n;i++){
            String s=tokens[i];
            if(s.length()>1){
                int num=0;
                if(s.charAt(0)=='-'){
                    for(int j=1;j<s.length();j++){
                        num*=10;
                        num+=(s.charAt(j)-'0');
                    }
                    num*=-1;
                    st.push(num);
                }else{
                    num=0;
                    for(int j=0;j<n;j++){
                        num*=10;
                        num+=(s.charAt(j)-'0');
                    }
                    st.push(num);
                }
            }
            else{
                int b=st.pop();
                int a =st.pop();
                if(s=="+"){
                    st.push(a+b);
                }else if(s=="-"){
                    st.push(a-b);
                }else if(s=="*"){
                    st.push(a*b);
                }else if(s=="/"){
                    st.push(a/b);
                }
            }
        }
        return st.pop();
    }
    public static void main(String[] args) {
        
    }
}
