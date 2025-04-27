class Solution {
    public int strStr(String haystack, String needle) {
        String windowStr = "";

        if(needle.length() > haystack.length())
            return -1;


        for(int i=0; i<needle.length(); i++){
            windowStr += haystack.charAt(i);
        }
        
        if(windowStr.equals(needle)) return 0;

        for(int i=needle.length(); i<haystack.length(); i++){
            windowStr = windowStr.substring(1) + haystack.charAt(i);

            if(windowStr.equals(needle))
                return i-needle.length()+1;
        }

        return -1;
    }
}