class Solution {
    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;

        for(int i=0; i<nums.length; i++){
            if(nums[i] <= first)
                first = nums[i];
            else if(nums[i] <= second)
                second = nums[i];
            else 
                return true;
        }

        return false;

        // int prev = 0, curr = 0, next = 0;
        // for(int i=1; i<nums.length; i++){
        //     if(i < nums.length-1){
        //         if(nums[(i-1)] < nums[i]){
        //             prev = nums[(i-1)];
        //             curr = nums[i];
        //         } 
        //         if(nums[i] < nums[(i+1)])
        //             next = nums[(i+1)];
        //     }
        // }
        // return prev < curr && curr < next;
    }
}