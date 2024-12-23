package LeetCodeTrees;

public class MinDepth {
    public static int minDepth(TreeNode root) {
        int ld=0;
        int rd=0;
        if(root==null){
            return 0;
        }
        ld=minDepth(root.left)+1;
        rd=minDepth(root.right)+1;
        return Math.min(ld, rd);
    }
    public static void main(String[] args) {
        
    }
}
