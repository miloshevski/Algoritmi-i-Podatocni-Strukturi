package ZadaciOdKurs;

import java.util.Scanner;

public class cetvrtta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SLL<String>list=new SLL<>();
        for(int i=0;i<5;i++){
            list.insertLast(sc.nextLine());
        }
        int l=sc.nextInt();
        SLLNode<String>it=list.first;
        System.out.println(list);
        while (it.succ!=null) {
            if(it.succ.element.length()==l){
                SLLNode<String>tmp=new SLLNode<String>("Outlier", it.succ);
                it.succ=tmp;
                it=tmp;
            }
            it=it.succ;
        }
        System.out.println(list);
    }
}
