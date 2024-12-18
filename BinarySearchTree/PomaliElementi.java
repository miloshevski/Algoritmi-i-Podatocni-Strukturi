package BinarySearchTree;

import java.util.Scanner;

public class PomaliElementi {
    public static int smaller(BNode<Integer>root,int val){
        if(root==null){
            return 0;
        }
        if(root.info<val){
            return 1+smaller(root.left, val)+smaller(root.right, val);
        }else{
            return smaller(root.left, val);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int q=sc.nextInt();
        sc.nextLine();
        BinarySearchTree<Integer>tree= new BinarySearchTree<Integer>();
        for(int i=0;i<n+q;i++){
            String ss=sc.next();
            int val=sc.nextInt();
            if(ss.equals("add")){
                tree.insert(val);
            }else if(ss.equals("ask")){
                BNode<Integer>tmp=tree.find(val);
                System.out.println(smaller(tree.getRoot(),val));
            }
        }
    }
}
