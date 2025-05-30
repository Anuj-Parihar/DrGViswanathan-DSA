// User function Template for Java

class Solution {
    int maxProduct(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        long prod1 = 1L*arr[n-1]*arr[n-2]*arr[n-3];
        long prod2 = 1L*arr[0]*arr[1]*arr[n-1];
        long res = Math.max(prod1, prod2);
        return (int) res;
    }
}
