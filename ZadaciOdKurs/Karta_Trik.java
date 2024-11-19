package ZadaciOdKurs;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Scanner;

public class Karta_Trik {
    public static int shuffles(int n){
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();

        int c=0;
        for(int i=1;i<52;i++){
            queue.add(i);
        }
        while (queue.peek()!=n) {
            for(int i=0;i<7;i++){
                stack.push(queue.poll());
            }
            for(int i=0;i<7;i++){
                queue.add(stack.pop());
                queue.add(queue.poll());
            }
            c++;
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(shuffles(n));
        sc.close();
    }
}
