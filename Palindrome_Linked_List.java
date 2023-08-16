// https://leetcode.com/problems/palindrome-linked-list/description/
class  Palindrome_Linked_List{
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> arr=new ArrayList<>();
        ListNode curr=head;
        while(curr!= null){
            arr.add(curr.val);
            curr=curr.next;
        }
        int low=0;
        int high=arr.size()-1;
        while(low <= high){
            if(arr.get(low) != arr.get(high))
                return false;
            low++;
            high--;
        }
        return true;
    }
}
