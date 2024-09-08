/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
    List<String> ans=new ArrayList<>();
    path(root,ans,"");
    return ans;
    }
    public void path(TreeNode node, List<String> ans,String temp){
        temp+=String.valueOf(node.val);
        if(node.left==null && node.right==null)
        ans.add(temp);

        else{
            if(node.right!=null)
            path(node.right,ans,temp+"->");

            if(node.left!=null)
            path(node.left,ans,temp+"->");
        }
        
    }
}