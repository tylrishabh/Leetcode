class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int j=0;

        for(int i=0; i<nums1.length; i++){
            if( i >= m ){
                nums1[i] = nums2[j++];
            }
        }
        Arrays.sort(nums1);
    }
}