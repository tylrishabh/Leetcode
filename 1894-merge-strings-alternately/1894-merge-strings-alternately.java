import java.util.*;

class Solution {
    public String mergeAlternately(String word1, String word2) {
        String finalstring = "";
        int len = 0, i=0;

        if(word1.length() == word2.length()){
            for( i=0; i<word1.length(); i++){
                finalstring += word1.charAt(i);
                finalstring += word2.charAt(i);
            }
        }else{
            String itr;
            i=0;

            if(word1.length() > word2.length())
                len = word2.length();
            else
                len = word1.length();

            while(i < len){
                finalstring += word1.charAt(i);
                finalstring += word2.charAt(i);
                i++;
            }
            if(i == word1.length())
                finalstring += word2.substring(i);
            else
                finalstring += word1.substring(i);
        }

        return finalstring;
    }
}