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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[] tl={0,0};
        int[] tr={0,n-1};
        int[] br={m-1,n-1};
        int[] bl={m-1,0};
        int c=m*n,count=0;;
        int[][] grid=new int[m][n];
        while(count<c){
            for(int i=tl[1];i<=tr[1];i++){
                if(head!=null){
               //     System.out.println(head.val+" "+tl[0]+" "+i);
                grid[tl[0]][i]=head.val;
              //  System.out.println(grid[0][2]);
                head=head.next;
                }
                else{
               //     System.out.println("else: "+tl[0]+" "+i);
                grid[tl[0]][i]=-1;}
                count++;
                if(count>=c)
                return grid;
            }
            for(int i=tr[0]+1;i<=br[0];i++){
                if(head!=null){
                grid[i][tr[1]]=head.val;
                head=head.next;
                }
                else
                grid[i][br[1]]=-1;
                count++;
                if(count>=c)
                return grid;
            }
            for(int i=br[1]-1;i>=bl[1];i--){
                if(head!=null){
                grid[br[0]][i]=head.val;
                head=head.next;
                }
                else
                grid[br[0]][i]=-1;
                count++;
                if(count>=c)
                return grid;
            }
            for(int i=bl[0]-1;i>tl[0];i--){
                if(head!=null){
                grid[i][bl[1]]=head.val;
                head=head.next;
                }
                else
                grid[i][bl[1]]=-1;
                count++;
                if(count>=c)
                return grid;
            }
            tl[0]++;
            tl[1]++;
            tr[0]++;
            tr[1]--;
            br[0]--;
            br[1]--;
            bl[0]--;
            bl[1]++;
        }

        

    return grid;
    }
}