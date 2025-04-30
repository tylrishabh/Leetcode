class Solution {
    public boolean isHappy(int n) {
        int squ=0;

        if(n < 9 && n != 1 && n != 7)
            return false;

        while(true){
            while(n != 0){
                int rem = n % 10;
                squ += rem*rem ;
                n = n/10;
            }
            System.out.println("squ"+ squ);
            if(squ > 9){
                n = squ;
                squ = 0;
            }
            else 
                break;
        }

        return squ == 1 || squ == 7;
    }
}