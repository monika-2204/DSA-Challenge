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
    void fun(TreeNode root,int targetSum,int sum,List<Integer> diary,List<List<Integer>> res){
        if(root==null) return;
        sum += root.val;
        diary.add(root.val);
        if(root.left == null && root.right == null) {
            if(sum == targetSum){
                res.add(new ArrayList<>(diary));
            }
            diary.remove(diary.size()-1);
            return;
        }
        fun(root.left,targetSum,sum,diary,res);
        fun(root.right,targetSum,sum,diary,res);
        diary.remove(diary.size()-1);
        return;
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        fun(root,targetSum,0,new ArrayList<>(),ans);
        return ans;
    }
}