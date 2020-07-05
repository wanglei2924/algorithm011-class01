/*
 * @lc app=leetcode id=347 lang=java
 *
 * [347] Top K Frequent Elements
 */

// @lc code=start
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Map<Integer, Integer> map = new HashMap<>();
        // for (int n : nums) {
        // map.put(n, map.getOrDefault(n, 0) + 1);
        // }

        // PriorityQueue<Map.Entry<Integer, Integer>> heap = new PriorityQueue<>((a, b)
        // -> (b.getValue() - a.getValue()));
        // for (int i : cnt.keySet()) {
        // heap.offer(new Tuple(cnt.get(i), i));
        // while (heap.size() > k)
        // heap.poll();
        // }

        // int[] res = new int[k];
        // int j = 0;
        // while (heap.size() > 0) {
        // res[j++] = heap.poll().v;
        // }
        // return res;

        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>(
                (a, b) -> (b.getValue() - a.getValue()));
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            maxHeap.add(entry);
        }

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            Map.Entry<Integer, Integer> entry = maxHeap.poll();
            res[i] = entry.getKey();
        }
        return res;
    }

    // class Tuple {
    // public int k, v;

    // public Tuple(int _k, int _v) {
    // k = _k;
    // v = _v;
    // }
    // }
}
// @lc code=end
