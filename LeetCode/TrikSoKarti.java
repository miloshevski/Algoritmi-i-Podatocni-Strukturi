import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class TrikSoKarti {
    public static void main(String[] args) {
        Queue<Integer>deck=new LinkedList<>();
        int n=15;
        for(int i=1;i<=51;i++){
            deck.add(i);
        }
        Stack<Integer> stack=new Stack<>();
        int c=0;
        while (true) {
            for(int i=0;i<7;i++){
                stack.push(deck.poll());
            }
            if(!stack.isEmpty()){
                deck.add(stack.pop());
                deck.add(deck.poll());
            }
            c++;
            if(deck.peek()==n){
                break;
            }
        }
        System.out.println(c);
    }
}
