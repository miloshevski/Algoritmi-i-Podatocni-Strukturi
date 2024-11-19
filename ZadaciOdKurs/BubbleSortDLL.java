package ZadaciOdKurs;

import java.util.Scanner;

import ZadaciOdKurs.DLL;

public class BubbleSortDLL {
    public static void sort(DLL<Integer> lista,int n){
        DLLNode<Integer> left = lista.getFirst();
        DLLNode<Integer>right = left.succ;
        boolean swapped=false;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(left.element>right.element){
                    int tmp=left.element;
                    left.element=right.element;
                    right.element=tmp;
                }
                left=left.succ;
                right=right.succ;
            }
            left=lista.getFirst();
            right=left.succ;
        }
    }
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    DLL<Integer> lista = new DLL<>();
    for(int i=0;i<n;i++){
        lista.insertLast(sc.nextInt());
    }
    sort(lista,n);
    System.out.println(lista.toString());
    }
}