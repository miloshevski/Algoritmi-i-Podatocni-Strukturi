package ZadaciOdKurs;

import java.util.Scanner;

public class Sesta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        SLL<String>list=new SLL<>();
        for(int i=0;i<n;i++){
            list.insertLast(sc.nextLine());
        }
        System.out.println(list.toString());
        int l=sc.nextInt();
        SLLNode<String>it=new SLLNode<String>(null, null);
        it=list.first;
        SLLNode<String>tmp=new SLLNode<String>(null, null);
        while (it!=null) {
            if(it.element.length()==l){
                tmp=it;
            }
            it=it.succ;
        }
        SLLNode<String>it2=new SLLNode<String>(null, null);
        it2=list.first;
        while (it2!=null) {
            if(it2.succ==tmp){
                it2.succ=tmp.succ;
                tmp.succ=list.first;
                list.first=tmp;
            }
            it2=it2.succ;
        }
        System.out.println(list.toString());
        sc.close();
    }
}
