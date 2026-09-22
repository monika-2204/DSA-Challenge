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
    Stack<TreeNode> asc = new Stack<>();
    Stack<TreeNode> desc = new Stack<>();
    TreeNode getsmall(){
        if(asc.isEmpty()) return null;
        TreeNode small = asc.peek();
        asc.pop();
        TreeNode rightChild = small.right;
        while(rightChild != null){
            asc.add(rightChild);
            rightChild = rightChild.left;
        }
        return small;
    }
    TreeNode getbig(){
        if(desc.isEmpty()) return null;
        TreeNode big = desc.peek();
        desc.pop();
        TreeNode leftChild = big.left;
        while(leftChild != null){
            desc.add(leftChild);
            leftChild = leftChild.right;
        }
        return big;
    }
    public boolean findTarget(TreeNode root, int k) {
        
        if(root==null) return false;
        TreeNode t = root;
        while(t != null){
            asc.add(t);
            t = t.left;
        }
        t = root;
        while(t != null){
            desc.add(t);
            t = t.right;
        }
        TreeNode i = getsmall();
        TreeNode j = getbig();
        while(i != null && j != null && i!=j && i.val<=j.val){
            int sum = i.val + j.val;
            if(sum==k) return true;
            if(sum<k){
                i = getsmall();
            }else {
                j = getbig();
            }
        }
        return false;
    }
}