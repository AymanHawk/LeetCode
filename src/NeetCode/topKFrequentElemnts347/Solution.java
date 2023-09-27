package NeetCode.topKFrequentElemnts347;

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 3, 6};
        topKFrequent(arr, 2);
    }

    static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> numFreq = new HashMap<Integer, Integer>();
        int[] result = new int[5];
        int count = 0;
        for (int i : nums) {
                numFreq.put(nums[i], i+1);
                //++count;
        }

        System.out.println(numFreq + "\n");
        return result;
    }
}
