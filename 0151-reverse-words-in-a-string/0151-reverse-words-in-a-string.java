class Solution {
    public String reverseWords(String s) {
        
        String arr[] = s.trim().split(" ");
        String str = "", temp = "";

        for (int i = arr.length - 1; i >= 0; i--) {
            temp = arr[i];
            if (!temp.equals("")) {
                if (i != arr.length - 1) {
                    str = str + " " + temp;
                } else {
                    str += temp;
                }
            }
        }
        return str;
    }
}