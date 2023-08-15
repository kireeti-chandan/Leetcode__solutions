// https://leetcode.com/problems/partition-list/description/
class Partition_List
 {
    public ListNode partition(ListNode head, int x) {
        ListNode prev=new ListNode(-1);
        ListNode prevN=prev;
        ListNode nextt=new ListNode(-1);
        ListNode nextN=nextt;
        ListNode curr=head;
        while(curr != null){
            if(curr.val < x)
            {
                prevN.next=curr;
                prevN=prevN.next;
            }
            else{
                nextN.next=curr;
                nextN=nextN.next;
            }
            curr=curr.next;
        }
        nextN.next=null;
        prevN.next=nextt.next;
        return prev.next;
    }
}
