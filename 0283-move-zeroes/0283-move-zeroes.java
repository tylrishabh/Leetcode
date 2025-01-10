import java.util.*;
class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0;
        int arr[] = new int[nums.length];
        
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                arr[j] = nums[i];
                j++;
            }
        }

        for(int i=0; i<arr.length; i++){
            nums[i] = arr[i];
        }
        arr = null;
    }
}