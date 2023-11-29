package NeetCode.TopKFrequentElemnts347;

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 8, 99, 2, 2, 6};
        topKFrequent(arr, 22);
    }
    static void topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> numFreq = new HashMap<Integer, Integer>();
        int[] result = new int[7];
        int count = 0;
        for (int x = 0; x < nums.length; x++) {
            if (!numFreq.containsKey(nums[x])) {
                numFreq.put(nums[x], count);
            } else {
//                ++count;
//                numFreq.put(num, count);
            }
            count++;
        }
        System.out.println(numFreq + "\n");
        //return result;
    }
}
