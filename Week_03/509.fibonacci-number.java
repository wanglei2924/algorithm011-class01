/*
 * @lc app=leetcode id=509 lang=java
 *
 * [509] Fibonacci Number
 */

// @lc code=start
class Solution {
    // public int fib(int N) {
    // 1.递归
    // 时间复杂度：O(2^n)
    // 空间复杂度：O(n)
    // if (N <= 1)
    // return N;
    // return fib(N - 1) + fib(N - 2);
    // }
    // 2：记忆化自底向上的方法
    // 时间复杂度：O(n)
    // 空间复杂度：O(n)
    // public int fib(int N) {
    // if (N <= 1)
    // return N;
    // int[] cache = new int[N + 1];
    // cache[0] = 0;
    // cache[1] = 1;

    // for (int i = 2; i <= N; i++) {
    // cache[i] = cache[i - 1] + cache[i - 2];
    // }
    // return cache[N];
    // }

    // 3.自底向上进行迭代
    // 时间复杂度：O(n)
    // 空间复杂度：O(1)
    public int fib(int N) {
        if (N <= 1)
            return N;
        int f0 = 0, f1 = 1, f2 = 1;
        for (int i = 2; i <= N; i++) {
            f2 = f0 + f1;
            f0 = f1;
            f1 = f2;
        }
        return f2;
    }

}
// @lc code=end
