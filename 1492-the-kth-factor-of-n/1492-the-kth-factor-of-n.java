class Solution {
    public int kthFactor(int n, int k) {
        int count = 0, i=0;
        boolean found = false;

        for(i=1; i<=n; i++){
            if(n % i == 0)
                count++;
            if(count == k){
                found = true;
                break;
            }
        }

        if(found)
            return i;
        else
        return -1;
    }
}