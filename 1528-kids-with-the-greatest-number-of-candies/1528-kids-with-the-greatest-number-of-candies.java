import java.util.*;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = -99;
        List<Boolean> boolList = new ArrayList<>(candies.length);

        for(int i:candies){
            max = Math.max(max, i);
        }

        for(int i:candies){
            boolList.add(i + extraCandies >= max );
        }
        return boolList;
    }
}