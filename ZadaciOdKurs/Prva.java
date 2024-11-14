package ZadaciOdKurs;

import java.util.Scanner;

public class Prva {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        SLL<String> lista= new SLL<>();
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            lista.insertLast(sc.nextLine());
        }
        System.out.println(lista.toString());
        int l=sc.nextInt();
        SLLNode<String>it=new SLLNode<String>(null, null);
        it=lista.first;
        while(it!=null){
            if(it.element.length()==l){
                lista.delete(it);
            }
            it=it.succ;
        }
        System.out.println(lista.toString());
        sc.close();
    }
}
