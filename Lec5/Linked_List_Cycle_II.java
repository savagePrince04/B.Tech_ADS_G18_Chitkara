package Lec5;

public class Linked_List_Cycle_II {
      class ListNode {
          int val;
          ListNode next;
          ListNode(int x) {
              val = x;
              next = null;
          }
      }
    public class Solution {
        public ListNode detectCycle(ListNode head) {
            ListNode slow=head;
            ListNode fast=head;
            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
                if(slow==fast){
                    break;
                }
            }
            slow=head;
            if(fast==null || fast.next==null){
                return null;
            }
            else{
                while(fast!=slow){
                    slow=slow.next;
                    fast=fast.next;
                }
            }
            return slow;
        }
    }
}
