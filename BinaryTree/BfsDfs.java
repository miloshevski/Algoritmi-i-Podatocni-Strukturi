package BinaryTree;
import java.util.Stack;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BfsDfs {
    public static void dfs(BNode<Integer>root){
        Stack<BNode<Integer>>stack=new Stack<>();
        if(root==null){
            return;
        }
        stack.push(root);
        while (!stack.isEmpty()) {
            BNode<Integer>tmp=stack.pop();
            if(tmp.right!=null){
                stack.push(tmp.right);
            }
            if(tmp.left!=null){
                stack.push(tmp.left);
            }
            System.out.print(tmp.info+" ");
        }
    }
    public static void bfs(BNode<Integer>root){
        if(root==null){
            return;
        }
        Queue<BNode<Integer>> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BNode<Integer>tmp=queue.poll();
            if(tmp.left!=null){
                queue.add(tmp.left);
            }
            if(tmp.right!=null){
                queue.add(tmp.right);
            }
            System.out.print(tmp.info+" ");
        }
    }
    public static int sum(BNode<Integer>root){
        if(root==null){
            return 0;
        }
        return root.info+sum(root.left)+sum(root.right);
    }
    public static int findMin(BNode<Integer>root){
        if(root==null){
            return Integer.MAX_VALUE;
        }
        int lm=findMin(root.left);
        int rm=findMin(root.right);
        return Math.min(root.info,Math.min(lm,rm));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BTree<Integer>tree= new BTree<>();
        BNode<Integer>a,b,c;
        tree.makeRoot(1);
        a=tree.addChild(tree.root, BNode.LEFT,2);
        b=tree.addChild(tree.root, BNode.RIGHT,3);
        c=tree.addChild(a,BNode.LEFT,4);
        a=tree.addChild(a,BNode.RIGHT,5);
        c=tree.addChild(b, BNode.RIGHT, 6);
        dfs(tree.root);
        System.out.println();
        bfs(tree.root);
        System.out.println();
        System.out.println(sum(tree.root));
    }
}
