package LeetCodeTrees;

public class MaxDepth {
    public static int maxDepth(TreeNode root) {
        int ld=0;
        int rd=0;
        if(root==null){
            return 0;
        }
        ld=maxDepth(root.left)+1;
        rd=maxDepth(root.right)+1;
        return Math.max(ld, rd);
    }
    public static void main(String[] args) {
        
    }
}
