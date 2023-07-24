class Right_View_of_Binary_Tree{
    //Function to return list containing elements of right view of binary tree.
    ArrayList<Integer> rightView(Node node) {
        //add code here.
        Queue<Node> que=new LinkedList<>();
        ArrayList<Integer> arr=new ArrayList<>();
        que.add(node);
        while(que.isEmpty() == false){
            int size=que.size();
            for(int i=0;i<size;i++){
                Node curr=que.poll();
                if(i == 0){
                    arr.add(curr.data);
                }
                if(curr.right != null)
                    que.add(curr.right);
                if(curr.left != null)
                    que.add(curr.left);
            }
        }
        return arr;
    }
}
