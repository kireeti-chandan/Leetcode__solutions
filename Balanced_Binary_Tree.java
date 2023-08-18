class Balanced_Binary_Tree {
    public boolean isBalanced(TreeNode root) {
        int res=balanced(root);
        if(res == -1)
            return false;
        return true;
        
    }
    public static int balanced(TreeNode root){
        if(root == null)
            return 0;
        int lheight=balanced(root.left);
        if(lheight == -1)
            return -1;
        int rheight=balanced(root.right);
        if(rheight == -1)
            return -1;
        if(Math.abs(lheight-rheight) > 1)
            return -1;
        else
           return  Math.max(lheight,rheight)+1;

    }

}
