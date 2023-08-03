// https://leetcode.com/problems/binary-tree-inorder-traversal/
class Binary_Tree_Inorder_Traversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ls=new ArrayList<>();
        inorder(root,ls);
        return ls;
    }
    public static void inorder(TreeNode root,List<Integer> ls){
        if(root == null)
            return;
        inorder(root.left,ls);
        ls.add(root.val);
        inorder(root.right,ls);
    }
}
