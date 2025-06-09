class Solution {

    public static int maxOnes(int a[], int n) {
        int totalOnes = 0;
        int max = Integer.MIN_VALUE;
        int currentDiff = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == 1) {
                totalOnes++;
                currentDiff -= 1;
            } else {
                currentDiff += 1;
            }
            max = Math.max(max, currentDiff);
            if (currentDiff < 0) {
                currentDiff = 0;
            }
        }
        if (max <= 0) return totalOnes;
        return totalOnes + max;
    }
}



