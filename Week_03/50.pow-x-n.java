/*
 * @lc app=leetcode id=50 lang=java
 *
 * [50] Pow(x, n)
 */

// @lc code=start
class Solution {
    // 1.暴力
    // for i:0->n-1
    // {
    // result *= x
    // }
    // O(n)

    // 2.分治
    // template: 1.terminator 2.process (split your big problem) 3. drill
    // down(subproblems), merge(subresult) 4.reverse states
    // x ^ n --> 2^10: 2^5 * 2^5, 2^5 -> (2^2)*2
    // pow(x, n):
    // subproblem: subresult = pow(x, n/2)
    // merge:
    // if n % 2 == 1{
    // // odd
    // result = subresult * subresult * x;
    // }else
    // {
    // // event
    // result = subresult * subresult;
    // }
    // log(N)
    public double myPow(double x, int n) {
        return n >= 0 ? helper(x, n) : 1.0 / helper(x, -n);
    }

    public double helper(double x, int n) {
        if (n == 0)
            return 1.0;
        double y = helper(x, n / 2);
        if (n % 2 == 0) {
            return y * y;
        } else {
            return y * y * x;
        }
    }
}
// @lc code=end
