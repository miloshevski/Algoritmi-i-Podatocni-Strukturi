package ZadaciOdKurs;

import java.util.Scanner;

public class cetvrtta {
    public static void main(String[] args) {
        SLL<String>list=new SLL<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            list.insertLast(sc.nextLine());
        }
        System.out.println(list);
        int l=sc.nextInt();
        SLLNode<String>it=new SLLNode<String>(null, null);
        it=list.first;
        while (it!=null) {
            if(it.succ.element.length()>l){
                SLLNode<String>tmp=new SLLNode<String>("Outlier", it.succ);
                it.succ=tmp;
            }
        }
        System.out.println(list);
    }
}
