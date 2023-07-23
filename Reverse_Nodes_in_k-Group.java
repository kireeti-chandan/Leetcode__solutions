class Reverse_Nodes_in_k-Group{
    public static int size1(ListNode head){
        int size=0;
        ListNode curr=head;
        while(curr != null){
            size++;
            curr=curr.next;
        }
        return size;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode curr=head;
        ListNode prev=null,next=curr;
        int count=0;
        if(size1(head) < k && next != null){
            return next;
        }
        else{
            while(count < k && curr != null){
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
                count++;
            }
        }
        if(next!= null){
            ListNode res_head=reverseKGroup(next,k);
            head.next=res_head;
        }
        return prev;
        
    }
}
