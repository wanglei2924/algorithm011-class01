import java.util.Arrays;

/*
 * @lc app=leetcode id=242 lang=java
 *
 * [242] Valid Anagram
 */

// @lc code=start
class Solution {
    public boolean isAnagram(String s, String t) {
        // 1.排序
        // O(nlogn)
        // O(1)
        // if (s.length() != t.length())
        // return false;
        // char[] str1 = s.toCharArray();
        // char[] str2 = t.toCharArray();
        // Arrays.sort(str1);
        // Arrays.sort(str2);
        // return Arrays.equals(str1, str2);

        // 2 哈希表
        // O(n)
        // O(1)
        if (s.length() != t.length())
            return false;
        int[] freqs = new int[26];
        for (char c : s.toCharArray())
            freqs[c - 'a']++;
        for (char c : t.toCharArray())
            if (--freqs[c - 'a'] < 0)
                return false;
        return true;

    }
}
// @lc code=end
