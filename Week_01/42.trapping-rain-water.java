/*
 * @lc app=leetcode id=42 lang=java
 *
 * [42] Trapping Rain Water
 */

// @lc code=start
class Solution {
    public int trap(int[] height) {
        // int sum = 0;
        // Stack<Integer> stack = new Stack<>();
        // int curr = 0;
        // while (curr < height.length) {
        // // 如果栈不空并且当前指向的高度大于栈顶高度就一直循环
        // while (!stack.empty() && height[curr] > height[stack.peek()]) {
        // int h = height[stack.pop()]; // 取出要出栈的元素
        // if (stack.empty()) { // 栈空就出去
        // break;
        // }
        // int distance = curr - stack.peek() - 1; // 两堵墙之前的距离。
        // int min = Math.min(height[stack.peek()], height[curr]);
        // sum += distance * (min - h);
        // }
        // stack.push(curr); // 当前指向的墙入栈
        // curr++; // 指针后移
        // }
        // return sum;

        // double pointer
        // Time Complexity: O(n)
        // Space Complexity: O(1)
        int left = 0, right = height.length - 1;
        int ans = 0;
        int left_max = 0, right_max = 0;
        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= left_max) {
                    left_max = height[left];
                } else {
                    ans += left_max - height[left];
                }
                ++left;
            } else {
                if (height[right] >= right_max) {
                    right_max = height[right];
                } else {
                    ans += right_max - height[right];
                }
                --right;
            }
        }
        return ans;
    }
}
// @lc code=end
