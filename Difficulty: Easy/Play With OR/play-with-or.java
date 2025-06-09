// User function Template for Java

class Solution {

    // Function for finding maximum and value pair
    public static int[] game_with_number(int arr[], int n) {
        int [] newarr = new int[n];
        for(int i =0;i<n-1;i++){
            newarr[i] =arr[i] | arr[i+1];
        }
        newarr[n-1] = arr[n-1];
        return newarr;
    }
}
