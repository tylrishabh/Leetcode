class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> hs = new HashSet<>();

        int left=0, right=0, total=0;

        while( right < s.length() ){
            if(!hs.contains(s.charAt(right))){
                hs.add(s.charAt(right));
                total = Math.max(total,  right-left + 1);
                right++;
            } else {
                hs.remove(s.charAt(left));
                left++;
            }
        }
        return total;
    }
}