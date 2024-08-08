class Solution {
    public int firstMissingPositive(int[] nums) {
    int val = 1;
        int len = 0;
        Arrays.sort(nums);

        while(true){
            // len = 0;
            if(len < nums.length){
                if(val == nums[len]){
                    val++;
                    len++;
                }
                else
                len++;
            }else
                break;
        }
        return val;
    }
}