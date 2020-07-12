import java.sql.ClientInfoStatus;

/*
 * @lc app=leetcode id=70 lang=java
 *
 * [70] Climbing Stairs
 */

// @lc code=start
class Solution {
    public int climbStairs(int n) {
        // 找最近重复子问题
        // if else, for while, recursion

        // 1: 1
        // 2: 2
        // 3: f(1) + f(2)
        // 4: f(2) + f(3)
        // f(n) = f(n-1) + f(n-2) : Fibonacci
        // a[n]
        // for (int i = 1; i <= n; i++) {
        // a[i] = a[i-1] + a[i-2];
        // }
        // 1.递归
        // 时间复杂度：O(2^n)
        // 空间复杂度：O(n)
        // if (n == 1)
        // return 1;
        // if (n == 2)
        // return 2;
        // return climbStairs(n - 1) + climbStairs(n - 2);

        // 2.记忆化递归
        // 时间复杂度：O(n)
        // 空间复杂度：O(n)
        // int[] memo = new int[n + 1];
        // return climbStairsMemo(n, memo);

        // 3.动态规划
        // 时间复杂度：O(n)
        // 空间复杂度：O(n)
        // if (n <= 2)
        // return n;
        // int[] dp = new int[n + 1];
        // dp[1] = 1;
        // dp[2] = 2;
        // for (int i = 3; i <= n; i++) {
        // dp[i] = dp[i - 1] + dp[i - 2];
        // }
        // return dp[n];

        // 4.优化动态规划，只保存n -1 和 n-2的状态
        // 菲波那切数列
        // 时间复杂度：O(n)
        // 空间复杂度：O(1)

        if (n <= 2)
            return n;
        int f1 = 1, f2 = 2, f3 = 3;
        for (int i = 3; i <= n; i++) {
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
        return f3;
    }

    // public int climbStairsMemo(int n, int[] memo) {
    // if (memo[n] > 0)
    // return memo[n];
    // if (n == 1) {
    // memo[n] = 1;
    // } else if (n == 2) {
    // memo[n] = 2;
    // } else {
    // memo[n] = climbStairsMemo(n - 1, memo) + climbStairsMemo(n - 2, memo);
    // }
    // return memo[n];
    // }

}
// @lc code=end
