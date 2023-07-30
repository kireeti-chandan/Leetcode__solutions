class Inorder_Successor_in_BST
{
    // returns the inorder successor of the Node x in BST (rooted at 'root')
	public Node inorderSuccessor(Node root,Node x)
     	{
	      //add code here.
		Stack<Node> st=new Stack<>();
		Node curr=root;
		while(curr != null || st.isEmpty() == false){
		    while(curr != null){
			st.push(curr);
			curr=curr.left;
		    }
		    curr=st.pop();
		    if(curr == x){
			if(curr.right == null && st.isEmpty()== true )
			    return null;
			else if(curr.right == null)
			    return st.pop();
			else{
			    curr=curr.right;
			    while(curr!= null){
			        st.push(curr);
			        curr=curr.left;
			    }
			    return st.pop();
			}
		    }
		    curr=curr.right;
		}
		return null;
    	}
}
