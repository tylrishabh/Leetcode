class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int lena = str1.length(), lenb = str2.length(), temp = 0;

        if(!str1.concat(str2).equals(str2.concat(str1)))
            return "";
        else{
            while(lenb != 0){
                temp = lenb;
                lenb = lena % lenb;
                lena = temp;
            }

            return str1.substring(0,lena);
        }

        // return "";
    }
}