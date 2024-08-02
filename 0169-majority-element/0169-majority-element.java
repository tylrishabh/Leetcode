import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
        int count = 1;
        int max = 0;
        int val = 0;
        
        Arrays.sort(nums);
        
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] == nums[j])
                    count++;
            }
            if(count > max){
                max = count;
                val = nums[i];
            }
            count = 1;
        }
        return val;
    }
}