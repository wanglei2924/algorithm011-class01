/*
 * @lc app=leetcode id=94 lang=java
 *
 * [94] Binary Tree Inorder Traversal
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
 * = left; this.right = right; } }
 */
class Solution {
    // 1.递归
    // public List<Integer> inorderTraversal(TreeNode root) {
    // List<Integer> res = new ArrayList<>();
    // helper(root, res);
    // return res;
    // }

    // public void helper(TreeNode root, List<Integer> res) {
    // if (root != null) {
    // helper(root.left, res);
    // res.add(root.val);
    // helper(root.right, res);
    // }
    // }

    public List<Integer> inorderTraversal(TreeNode root) {
        // 2.基于栈的遍历
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            res.add(curr.val);
            curr = curr.right;
        }
        return res;

        // 3.颜色标记法
        // if (root == null)
        // return new ArrayList<Integer>();

        // List<Integer> res = new ArrayList<>();
        // Stack<ColorNode> stack = new Stack<>();
        // stack.push(new ColorNode(root, "white"));

        // while (!stack.empty()) {
        // ColorNode cn = stack.pop();

        // if (cn.color.equals("white")) {
        // if (cn.node.right != null)
        // stack.push(new ColorNode(cn.node.right, "white"));
        // stack.push(new ColorNode(cn.node, "gray"));
        // if (cn.node.left != null)
        // stack.push(new ColorNode(cn.node.left, "white"));
        // } else {
        // res.add(cn.node.val);
        // }
        // }

        // return res;

    }

    class ColorNode {
        TreeNode node;
        String color;

        public ColorNode(TreeNode node, String color) {
            this.node = node;
            this.color = color;
        }
    }
}
// @lc code=end
