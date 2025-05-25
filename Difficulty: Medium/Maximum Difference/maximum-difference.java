class Solution {
    public int findMaxDiff(int[] arr) {
        // code here
        int n = arr.length;
        int ls [] = new int [n];
        int rs [] = new int [n];
        ls[0]= 0;
        rs[n-1] =0;
        for (int i = 1; i < n; i++) {
            int min = 0;
            for (int j = i - 1; j >= 0; j--) {  
                if (arr[j] < arr[i]) {
                    min = arr[j];
                    break; 
                }
            }
            ls[i] = min;
        }
        for (int i = 0; i < n - 1; i++) {
            int min = 0;
            for (int j = i + 1; j < n; j++) { 
                if (arr[j] < arr[i]) {
                    min = arr[j];
                    break; 
                }
            }
            rs[i] = min;
        }
        int maxDiff = 0;
        for (int i = 0; i<n; i++) {
            int diff= Math.abs(ls[i] - rs[i]);
            maxDiff = Math.max(maxDiff, diff);
        }
        return maxDiff;
    }
}

