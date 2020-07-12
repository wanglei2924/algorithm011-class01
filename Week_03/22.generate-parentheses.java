import java.util.List;
import java.util.ArrayList;

/*
 * @lc app=leetcode id=22 lang=java
 *
 * [22] Generate Parentheses
 */

// @lc code=start
class Solution {
    private List<String> ans;

    public List<String> generateParenthesis(int n) {
        ans = new ArrayList<>();
        _generate(0, 0, n, "");
        return ans;
    }

    private void _generate(int left, int right, int n, String s) {
        // terminator
        if (left == n && right == n) {
            ans.add(s);
            return;
        }
        // process current logic: left, right

        // drill down
        // left随时可以加，只要别超标 left < n
        // right 左个数>右个数 left > right
        if (left < n)
            _generate(left + 1, right, n, s + "(");
        if (left > right)
            _generate(left, right + 1, n, s + ")");
        // reverse status
    }
}
// @lc code=end
