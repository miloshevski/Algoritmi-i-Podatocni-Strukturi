package LeetCodeTrees;


public class SameTree {
    
public static boolean isSameTree(TreeNode p, TreeNode q) {
    if(p==null&&q==null){
        return false;   
    }
    if(p==null||q==null||p.val!=q.val){
        return false;
    }
    return isSameTree(p.left,q.right);
}
    public static void main(String[] args) {
        
    }
}
