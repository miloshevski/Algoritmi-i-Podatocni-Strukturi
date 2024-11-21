package ZadaciOdKurs;

public class DvojnoPovrzana {
    public static void main(String[] args) {
        DLLNode<Integer>head=new DLLNode<>(0,null,null);
        head.succ=new DLLNode<Integer>(1, head, null);
        System.out.println(head.succ.pred);
    }
}
