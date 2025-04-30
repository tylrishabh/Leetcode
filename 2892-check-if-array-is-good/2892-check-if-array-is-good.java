class Solution {
    public boolean isGood(int[] nums) {
        int base = nums.length-1;
        int baseArr[] = new int[base + 1];

        for(int i=0; i<baseArr.length; i++){
            baseArr[i] = i + 1;
        }
        baseArr[base] = base;
        Arrays.sort(nums);

        return Arrays.equals(nums,baseArr);

    //    int count = 0;
    //    int base = nums.length - 1;
    //    Arrays.sort(nums);

    //    if((nums.length == 2) && (nums[0] == base && nums[1] == base))
    //         return true;

    //    for(int i=1; i<nums.length; i++){
    //         if(nums[i] == base)
    //             count++;
    //         else if(nums[i] == nums[i-1])
    //             return false;
    //     }

    //     return count == 2;
    }
}