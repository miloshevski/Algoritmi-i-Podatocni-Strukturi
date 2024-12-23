package LeetCodeTrees;
// Definition for a binary tree node.

public class SymetricTree {
    public static boolean helper(TreeNode l,TreeNode r){
        if(l==null&&r==null){
            return true;
        }
        if(l==null||r==null||l.val!=r.val){
            return false;
        }
        return helper(l.left, r.right)&&helper(l.right,r.left);
    }
    public static boolean isSymmetric(TreeNode root) {
        return helper(root,root);
    }
    public static void main(String[] args) {
        
    }
}
