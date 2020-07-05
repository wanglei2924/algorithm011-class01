/*
 * @lc app=leetcode id=429 lang=java
 *
 * [429] N-ary Tree Level Order Traversal
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
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root != null)
            traverseNode(root, 0, res);
        return res;
    }

    public void traverseNode(Node root, int level, List<List<Integer>> res) {
        if (res.size() <= level)
            res.add(new ArrayList<>());
        res.get(level).add(root.val);
        for (Node c : root.children) {
            traverseNode(c, level + 1, res);
        }
    }
}
// @lc code=end
