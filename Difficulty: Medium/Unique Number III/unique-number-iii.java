// User function Template for Java

class Solution {
    public int getSingle(int[] arr) {
       Set<Integer>see = new HashSet<>();
        Set<Integer>duplicates = new HashSet<>();
        for (int num :arr) {
            if (!see.add(num)) {  
                duplicates.add(num);
            }
        }
         for (int num : arr) {
            if (!duplicates.contains(num)) {
                return num;
            }
        }
        return 0;
    }
}