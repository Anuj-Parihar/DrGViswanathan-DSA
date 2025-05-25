// User function Template for Java

class Solution {
    // Function to check if we can reach the last index from the 0th index.
    public boolean canReach(int[] arr) {
        int near=0;
        for (int i = 0;i<arr.length; i++) {
            if (i > near) {
                return false; 
            }
            near= Math.max(near, i+arr[i]);
        }
        return true;
    }
}
