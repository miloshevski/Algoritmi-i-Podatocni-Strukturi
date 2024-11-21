package ZadaciOdKurs;

public class KruznaLista {
    public static void main(String[] args) {
        SLLNode<Integer>head=new SLLNode<Integer>(0, null);
        head.succ=new SLLNode<Integer>(1, head);
        head.succ.succ=new SLLNode<Integer>(2,head);
        SLLNode<Integer>it=head;
        while (it!=null) {
            System.out.println(it.element);
            it=it.succ;
        }
    }
}
