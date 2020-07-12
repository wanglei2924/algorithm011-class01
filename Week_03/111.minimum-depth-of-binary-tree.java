/*
 * @lc app=leetcode id=111 lang=java
 *
 * [111] Minimum Depth of Binary Tree
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
 * = left; this.right = right; } }
 */
class Solution {
    public int minDepth(TreeNode root) {
        // 1.递归
        // 时间复杂度：O(n)
        // 空间复杂度：O(n)
        if (root == null)
            return 0;
        int l = minDepth(root.left);
        int r = minDepth(root.right);
        return (l == 0 || r == 0) ? Math.max(l, r) + 1 : Math.min(l, r) + 1;
    }
}
// @lc code=end
