/*
 * @lc app=leetcode id=189 lang=java
 *
 * [189] Rotate Array
 */

// @lc code=start
class Solution {
    public void rotate(int[] nums, int k) {
        // 1.force method.
        // Time Complexity: O(n*k)
        // Space Complexity: O(1)
        // int temp, prev;
        // for (int i = 0; i < k; i++) {
        // prev = nums[nums.length - 1];
        // for (int j = 0; j < nums.length; j++) {
        // temp = nums[j];
        // nums[j] = prev;
        // prev = temp;
        // }
        // }

        // 2.use extra array
        // Time Complexity: O(n)
        // Space Complexity: O(n)
        // int[] a = new int[nums.length];
        // for (int i = 0; i < nums.length; i++) {
        // a[(i + k) % nums.length] = nums[i];
        // }
        // System.arraycopy(a, 0, nums, 0, a.length);

        // 3.reverse all elements, reverse first k elements, reverse last n - k
        // elements.
        // Time Complexity: O(n)
        // Space Complexity: 1
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
// @lc code=end
