class Level_order_traversal_in_spiral_form
{
    //Function to return a list containing the level order 
    //traversal in spiral form.	
    ArrayList<Integer> findSpiral(Node root) 
    {
        // Your code here
        if(root == null)
            return null;
        Deque<Node> deq=new ArrayDeque<>();
        ArrayList<Integer> arr=new ArrayList<>();
        deq.add(root);
        int count=0;
        while(deq.isEmpty() == false){
            int size=deq.size();
            for(int i=0;i< size;i++){
                if(count %2 == 0){
                    Node curr=deq.removeLast();
                    arr.add(curr.data);
                    if(curr.right != null)
                        deq.addFirst(curr.right);
                    if(curr.left != null)
                        deq.addFirst(curr.left);
                   
                }
                else{
                    Node curr=deq.removeFirst();
                    arr.add(curr.data);
                    if(curr.left != null)
                        deq.addLast(curr.left);
                    if(curr.right != null)
                        deq.addLast(curr.right); 
                }
            }
            count++;
        }
        return arr;
    }
}
