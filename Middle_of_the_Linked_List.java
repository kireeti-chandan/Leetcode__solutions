class Middle_of_the_Linked_List{
    public ListNode middleNode(ListNode head) {
        if(head == null)
            return null;
        ListNode slow=head;
        ListNode fast=head;
        while(fast != null && fast.next != null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
}
