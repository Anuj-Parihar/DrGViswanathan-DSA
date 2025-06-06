class Solution {
    static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k) {
        ArrayList<Integer> newarr = new ArrayList<>();
        int max=Integer.MIN_VALUE;
        int maxIndex = -1;
        for (int i = 0;i<=n-k; i++) {
            if (maxIndex<i) {
                max=arr[i];
                maxIndex=i;
                for (int j =i+1; j< k+i; j++) {
                    if (arr[j]>max) {
                        max=arr[j];
                        maxIndex=j;
                    }
                }
            } else {
                if (arr[i+k-1] > max) {
                    max = arr[i+k-1];
                    maxIndex = i+ k -1;
                }
            }
            newarr.add(max);
        }
        return newarr;
    }
}