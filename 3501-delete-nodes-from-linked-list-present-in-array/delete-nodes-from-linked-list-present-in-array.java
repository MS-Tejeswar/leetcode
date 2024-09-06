/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        ListNode d=new ListNode(-1);
        ListNode temp=d;
        Set<Integer> x = new HashSet<>(Arrays.asList(Arrays.stream(nums).boxed().toArray(Integer[]::new)));
        while(head!=null){
            if(!x.contains(head.val)){
                temp.next=head;
                temp=temp.next;
            }
            if(head.next==null){
                if(x.contains(head.val)){
                    temp.next=null;
                }
            }
            head=head.next;
        }
        return d.next;
    }
}