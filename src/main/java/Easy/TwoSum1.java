package Easy;



import java.sql.Array;

/*
Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
Ï
 * */

public class TwoSum1 {

    public static void main(String args[]){
        int arr[] = {3,2,6};
        System.out.println(twoSum(arr, 9));
    }

    static public int[] twoSum(int[] nums, int target){
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++){
                if (nums[i] + nums[j] == target)
                    return new int[]{i, j};
            }
        }
        return new int[]{};//returns an empty arr if none
    }
}
