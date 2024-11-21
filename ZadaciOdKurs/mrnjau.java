package ZadaciOdKurs;

public class mrnjau {
    public static void main(String[] args) {
        SLLNode<Integer>head=new SLLNode<Integer>(0, null);
        head.succ=new SLLNode<Integer>(1, null);
        head.succ.succ=new SLLNode<Integer>(2, null);
        head.succ.succ.succ=new SLLNode<Integer>(3, null);
        head.succ.succ.succ.succ=new SLLNode<Integer>(4, null);
        head.succ.succ.succ.succ.succ=new SLLNode<Integer>(5, null);
        SLLNode<Integer> it=head;
        while (it!=null) {
            System.out.print(it.element+" ");
            it=it.succ;
        }
        SLLNode<Integer>find=head;
        for(int i=0;i<3;i++){
            find=find.succ;
        }
        System.out.println(find.element);
        SLLNode<Integer>last=head;
        while (last.succ!=null) {
            last=last.succ;
        }
        System.out.println(last.element);
        last.succ=head;
        head=find.succ;
        find.succ=null;
        SLLNode<Integer>print=head;
        while (print!=null) {
            System.out.print(print.element+" ");
            print=print.succ;
        }
    }   
}
