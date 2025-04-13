class Solution {

    public void reverse(int arr[], int left, int right){

        Integer temp=null;

        while(left < right){
            temp = arr[right];
            arr[right--]=arr[left];
            arr[left++] = temp;
        }

    }


    public void rotate(int[] nums, int k) {

        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
        
        // int left = 0;
        // int right = nums.length - k;
        // int temp = nums.length - k ;

        // while(right != nums.length || left < temp){
        //     if(right < nums.length){
        //         System.out.print(nums[right]);
        //         right++;
        //     } else{
        //         System.out.print(nums[left]);
        //         left++;
        //     }
        // }
    }
}