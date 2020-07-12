import java.util.LinkedList;
import java.util.Stack;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode id=98 lang=java
 *
 * [98] Validate Binary Search Tree
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
 * = left; this.right = right; } }
 */
class Solution {
    // public boolean isValidBST(TreeNode root) {
    // 1.递归
    // 时间复杂度：O(n)
    // 空间复杂度：O(n)
    // return recurse(root, null, null);

    // }

    // public boolean recurse(TreeNode node, Integer lower, Integer upper) {
    // if (node == null)
    // return true;
    // int val = node.val;
    // if (lower != null && val <= lower)
    // return false;
    // if (upper != null && val >= upper)
    // return false;
    // if (!recurse(node.right, val, upper))
    // return false;
    // if (!recurse(node.left, lower, val))
    // return false;
    // return true;
    // }

    // 2.迭代
    // 时间复杂度：O(n)
    // 空间复杂度：O(n)
    // LinkedList<TreeNode> stack = new LinkedList<>();
    // LinkedList<Integer> uppers = new LinkedList<>();
    // LinkedList<Integer> lowers = new LinkedList<>();

    // public void update(TreeNode root, Integer lower, Integer upper) {
    // stack.add(root);
    // lowers.add(lower);
    // uppers.add(upper);
    // }

    // public boolean isValidBST(TreeNode root) {
    // Integer lower = null, upper = null, val;
    // update(root, lower, upper);
    // while (!stack.isEmpty()) {
    // root = stack.poll();
    // lower = lowers.poll();
    // upper = uppers.poll();
    // if (root == null)
    // continue;
    // val = root.val;
    // if (lower != null && val <= lower)
    // return false;
    // if (upper != null && val >= upper)
    // return false;
    // update(root.right, val, upper);
    // update(root.left, lower, val);
    // }
    // return true;
    // }

    // BST --> 中序遍历是递增的
    // 时间复杂度：O(n)
    // 空间复杂度：O(n)
    public boolean isValidBST(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        Integer lastVal = null;
        while (!stack.empty() || root != null) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            // 如果中序遍历得到的节点的值小于等于前一个 inorder，说明不是二叉搜索树
            if (lastVal != null && root.val <= lastVal)
                return false;
            lastVal = root.val;
            root = root.right;
        }
        return true;
    }

}
// @lc code=end
