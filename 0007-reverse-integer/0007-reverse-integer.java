class Solution {
    public int reverse(int x) {
        int num = 0;

        while(x !=0 ){
            int rem = x%10;
            x = x/10;
            // check for overflow and underflow condition
            // Check for overflow before multiplying by 10 and adding the remainder
            if (num > Integer.MAX_VALUE / 10 || (num == Integer.MAX_VALUE / 10 && rem > 7)) {
                return 0; // Overflow case for positive numbers
            }
            if (num < Integer.MIN_VALUE / 10 || (num == Integer.MIN_VALUE / 10 && rem < -8)) {
                return 0; // Overflow case for negative numbers
            }
            num = num*10 + rem;
        }

        return num;
    }
}