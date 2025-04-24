class Solution {
    public String longestCommonPrefix(String[] strs) {
        String str=strs[0];
        int index = 0;

        if (strs.length == 0) return "";

        for(int i=1; i<strs.length; i++){
            index = 0;
            while(index < str.length() && index < strs[i].length()){
                if(str.charAt(index) == strs[i].charAt(index))
                    index++;
                else 
                    break;
            }
            str = str.substring(0,index);
        }

        // for(int i=1; i<strs.length; i++){
        //     while(strs[i].indexOf(str) != 0){
        //         str = str.substring(0, str.length()-1);

        //         if(str.isEmpty())
        //             return "";
        //     }
        // }

        // return str;
    return str;
    }
}