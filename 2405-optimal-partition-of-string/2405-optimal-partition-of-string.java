class Solution {
    public int partitionString(String s) {
        int count = 1;
        Set<Character> set= new HashSet<>();
       
       for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            
            if (set.contains(currentChar)) {
                // Start a new substring since we found a duplicate
                set.clear();
                count++;
            }
            
            // Add the current character to the set for the new substring
            set.add(currentChar);
        }

        return count;
    }
}