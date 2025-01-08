class Solution {
    public String reverseVowels(String s) {

        char arr[] = s.toCharArray();
        int left = 0;
        int right = arr.length-1;


        while(left < right){
            char charLeft = arr[left];
            char charRight = arr[right];
            
            if(isVowel(charLeft) && isVowel(charRight)){
                char temp = charLeft;
                arr[left] = charRight;
                arr[right] = temp;
                left++;
                right--;
            }else {
                // Move left pointer if not a vowel
                if (!isVowel(charLeft)) {
                    left++;
                }
                // Move right pointer if not a vowel
                if (!isVowel(charRight)) {
                    right--;
                }
            }
        }
        return new String(arr);
    }
    private boolean isVowel(char ch){
        return "aeiouAEIOU".indexOf(ch) != -1;
    }
}