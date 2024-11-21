package ZadaciOdKurs;

import java.util.Scanner;

class Vraboten{
    public int id;
    public int age;
    Vraboten(int id,int age){
        this.id=id;
        this.age=age;
    }
    public void print(){
        System.out.println(id+":"+age);
    }
}

public class KolokviumskaListi {
    
    public static void main(String[] args) {
        SLL<Vraboten>dev=new SLL<>();
        SLL<Vraboten>qa= new SLL<>();
        Scanner sc = new Scanner(System.in);
        int d=sc.nextInt();
        int q=sc.nextInt();

        for(int i=0;i<d;i++){
            dev.insertLast(new Vraboten(sc.nextInt(), sc.nextInt()));
        }
        for(int i=0;i<q;i++){
            qa.insertLast(new Vraboten(sc.nextInt(),sc.nextInt()));
        }
        System.out.println();
        SLLNode<Vraboten>najmlad=qa.first;
        SLLNode<Vraboten>iter=qa.first;
        while (iter!=null) {
            if(iter.element.age<=najmlad.element.age){
                najmlad=iter;
            }
            iter=iter.succ;
        }
        SLLNode<Vraboten> i=qa.first;

        qa.delete(najmlad);
        int l=dev.size()/2;
        SLLNode<Vraboten> it=dev.first;
        for(int j=0;j<l;j++){
            it=it.succ;
        }
        dev.insertBefore(najmlad.element,it);
        it=dev.first;
        while (it!=null) {
            it.element.print();
            it=it.succ;
        }
        sc.close();
    }
}