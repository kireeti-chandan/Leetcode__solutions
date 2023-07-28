class Lowest_Common_Ancestor_In_A_Bst
{   
    //Function to find the lowest common ancestor in a BST. 
	Node LCA(Node root, int n1, int n2)
	{
        // code here. 
        if(root == null)
            return null;
        if(root.data == n1 || root.data == n2)
            return root;
        Node lca1=LCA(root.left,n1,n2);
        Node lca2=LCA(root.right,n1,n2);
        if(lca1 != null && lca2!= null)
            return root;
        if(lca1 != null)
            return lca1;
        else
            return lca2;
    }
    
}
