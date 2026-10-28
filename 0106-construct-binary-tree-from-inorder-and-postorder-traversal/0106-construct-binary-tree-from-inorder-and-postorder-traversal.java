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
    int idx;
    private TreeNode fun(int[]postorder,int low,int high,HashMap<Integer,Integer> map){
        if(low>high ){
            return null;
        }
        TreeNode node = new TreeNode(postorder[idx]);
        int id = map.get(postorder[idx]);
        idx--;
        node.right = fun(postorder,id+1,high,map);
        node.left = fun(postorder,low,id-1,map);
        return node;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        idx = postorder.length-1;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return fun(postorder,0,postorder.length-1,map);
    }
}