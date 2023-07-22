class Binary_Tree_Level_Order_Traversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> qu=new LinkedList<>();
        List<List<Integer>> li=new LinkedList<>();
        if(root == null){
            return li;
        }
        qu.add(root);
        int count=0;
        while(qu.isEmpty() == false){
            int size=qu.size();
             li.add(new LinkedList<>());
            for(int i=0;i<size;i++){
                TreeNode curr=qu.poll();
                li.get(count).add(curr.val);
                if(curr.left != null)
                    qu.add(curr.left);
                if(curr.right != null)
                    qu.add(curr.right);
            }
            count++;
        }
        System.out.println(count);
        return li;
    }
}
