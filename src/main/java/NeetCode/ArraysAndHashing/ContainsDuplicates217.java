package NeetCode.ArraysAndHashing;

/*
Example 1:

Input: nums = [1,2,3,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false
Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
* */

import java.util.HashSet;

public class ContainsDuplicates217 {

    public static void main(String[] args){
        int[] nums = {1,2,3,};
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) { //static modifier indicates that the calling of the method belongs to the class itself(called in line 6) and not and a new instance of the object
        HashSet<Integer> list = new HashSet<Integer>();
        for (int i : nums){
            if (!list.contains(i))
                list.add(i); //if the list doesn't contain i then add it to the list ELSE return true bc then it has a duplicate
            else
                return true;
        }
        return false;
    }

}
