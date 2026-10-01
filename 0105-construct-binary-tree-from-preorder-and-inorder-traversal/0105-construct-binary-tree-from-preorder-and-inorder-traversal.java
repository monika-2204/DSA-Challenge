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
    int idx = 0;
    
    TreeNode fun(int[] preorder,int low,int high,HashMap<Integer,Integer> map){
        if(low>high || idx>=preorder.length) return null;
        TreeNode node = new TreeNode(preorder[idx]);
        int id = map.get(preorder[idx]);
        idx++;
        node.left = fun(preorder,low,id-1,map);
        node.right = fun(preorder,id+1,high,map);
        return node;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
            }
        return fun(preorder,0,preorder.length-1,map);
    }
}