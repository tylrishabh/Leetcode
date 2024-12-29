import java.util.*;

class Solution {
    public String mergeAlternately(String word1, String word2) {
        String finalstring = "";
        int i=0;
        int len = Math.min(word1.length(), word2.length());

            while(i < len){
                finalstring += word1.charAt(i);
                finalstring += word2.charAt(i);
                i++;
            }
            if(i == word1.length())
                finalstring += word2.substring(i);
            else
                finalstring += word1.substring(i);

        return finalstring;
    }
}