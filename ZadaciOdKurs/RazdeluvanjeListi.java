package ZadaciOdKurs;

public class RazdeluvanjeListi {
    public static void main(String[] args) {
        SLL<Integer>lista= new SLL<>();
        for(int i=0;i<20;i++){
            lista.insertLast(i);
        }
        SLL<Integer> parni=new SLL<>();
        SLL<Integer> neparni=new SLL<>();
        SLLNode<Integer> it=lista.first;
        while (it!=null) {
            if(it.element%2==0){
                parni.insertLast(it.element);
            }else{
                neparni.insertLast(it.element);
            }
            it=it.succ;
        }
        System.out.println(parni);
        System.out.println(neparni);
    }
}
