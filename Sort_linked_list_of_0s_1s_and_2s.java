class Sort_linked_list_of_0s_1s_and_2s
{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        // add your code here
        if(head == null || head.next == null)
            return head;
        Node flow=new Node(0);
        Node fmid=new Node(0);
        Node fhigh=new Node(0);
        Node curr=head;
        Node low=flow;
        Node mid=fmid;
        Node high=fhigh;
        while(curr!= null){
            if(curr.data == 0){
                    low.next=curr;
                    low=low.next;
            }
            else if(curr.data == 1){
                    mid.next=curr;
                    mid=mid.next;
            }
            else{
                    high.next=curr;
                    high=high.next;
            }
            curr=curr.next;
        }
        low.next = (fmid.next!=null) ? (fmid.next) : (fhigh.next); 
        mid.next = fhigh.next; 
        high.next = null;
        head = flow.next;
        return head;
    }
}
