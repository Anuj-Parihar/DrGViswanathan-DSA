// User function Template for Java

class Solution {
    public long[] findElements(long arr[]) {
        long [] newarr = new long[arr.length-2];
        Arrays.sort(arr);
        for(int i=0;i<arr.length-2;i++){
            newarr[i] = arr[i];
        }
        return newarr;
    }
}