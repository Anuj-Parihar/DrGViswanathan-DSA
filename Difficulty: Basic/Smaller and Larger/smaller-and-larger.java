// User function Template for Java

class Solution {
    int[] getMoreAndLess(int[] arr, int target) {
        int smallestCount=0;
        int largestCount=0;
        int newarr [] =new int[2]; 
        for(int i =0; i<arr.length;i++){
            if(arr[i]<=target){
                smallestCount++;
            }
        }
        for(int i =0; i<arr.length;i++){
            if(arr[i]>=target){
                largestCount++;
            }
        }
        newarr[0] = smallestCount;
        newarr[1] = largestCount;
        return newarr;
    }
}