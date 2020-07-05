/*
 * @lc app=leetcode id=589 lang=java
 *
 * [589] N-ary Tree Preorder Traversal
 */

// @lc code=start
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    // 1.递归
    // public List<Integer> preorder(Node root) {
    // List<Integer> res = new ArrayList<>();
    // if (root == null)
    // return res;
    // helper(root, res);
    // return res;
    // }

    // public void helper(Node root, List<Integer> res) {
    // if (root != null) {
    // res.add(root.val);
    // for (Node c : root.children) {
    // helper(c, res);
    // }
    // }
    // }
    // 2.迭代
    public List<Integer> preorder(Node root) {
        List<Integer> res = new ArrayList<>();
        if (root == null)
            return res;

        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Node n = stack.pop();
            res.add(n.val);
            for (int i = n.children.size() - 1; i >= 0; i--) {
                stack.push(n.children.get(i));
            }
        }
        return res;
    }
}
// @lc code=end
