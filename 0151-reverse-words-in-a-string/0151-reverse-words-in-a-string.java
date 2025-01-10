class Solution {
    public String reverseWords(String s) {
        
        String arr[] = s.trim().split(" +"); // + new thing to know 
        String str = "";

        for (int i = arr.length - 1; i >= 0; i--) {
            if(i !=0 )
                str += arr[i]+" ";
            else
                str += arr[i];
            // temp = arr[i];
            // if (!temp.equals("")) {
                // if (i != arr.length - 1) {
                //     str = str + " " + temp;
                // } else {
                //     str += temp;
                // }
            // }
        }
        return str;
    }
}