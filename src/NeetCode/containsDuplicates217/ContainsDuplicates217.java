package NeetCode.containsDuplicates217;

public class ContainsDuplicates217 {

    public boolean containsDuplicate(int[] nums) {

        boolean result = false;

        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] == nums[j])
                    result = true;
                else
                    result = false;
            }
        }

        return result;

    }



}

