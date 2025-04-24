class Solution {
    public boolean isPalindrome(int x) {
        boolean flag = false;
        int rev = 0;
        int temp = x;
        
        if(x < 0)
            return false;
        
        while(x != 0){
            rev = rev*10 + x % 10;
            x = x/10;
        }
        
        if(rev == temp)
            return true;
        return false;
    }
}