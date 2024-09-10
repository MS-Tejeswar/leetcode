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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp=head;
        while(temp.next!=null){
            int a=temp.val;
            int b=temp.next.val;
            int k=gcd(a,b);
            ListNode tempi=new ListNode(k);
            tempi.next=temp.next;
            temp.next=tempi;
            temp=temp.next.next;
        }
        return head;
    }
    

public int gcd(int x, int y){ 
int gcd = 1;
for(int i = 1; i <= x && i <= y; i++)  
{  
if(x%i==0 && y%i==0) 
gcd = i;  
}  
return gcd;
}  

}