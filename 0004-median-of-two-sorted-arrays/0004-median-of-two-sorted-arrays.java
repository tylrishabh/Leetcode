class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

    int newArr[] = new int[nums1.length + nums2.length];
    int k=0;

    for(int i=0; i<nums1.length; i++){
        newArr[k] = nums1[i];
        k++;
    }

    for(int i=0; i<nums2.length; i++){
        newArr[k] = nums2[i];
        k++;
    }

    Arrays.sort(newArr);
     
    if(newArr.length % 2 == 0){
        int num1 = newArr.length / 2;
        int num2 = num1 - 1;

    return (newArr[num1] + newArr[num2]) / 2.0;
    }
    else
    return newArr[newArr.length / 2];
    }
}