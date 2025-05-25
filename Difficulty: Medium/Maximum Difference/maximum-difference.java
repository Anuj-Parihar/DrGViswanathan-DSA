// class Solution {
//     public int findMaxDiff(int[] arr) {
//         // code here
//         int ls [] = new int [arr.length];
//         int rs [] = new int [arr.length];
//         ls[0]= 0;
//         rs[rs.length-1] =0;
//         for(int i= arr.length-1; i>0; i--){
//             for(int j = 0 ; j < i ; j++ ){
//                 if(arr[j]<arr[i]){
//                     ls[i] = arr[j];
//                 }
//             }
//         }
//         for(int i= 0; i<arr.length-1; i++){
//             for(int j = arr.length-1 ; j > i ; j-- ){
//                 if(arr[j]<arr[i]){
//                     rs[i] = arr[j];
//                 }
//             }
//         }
//         int maxDiff = 0;
//         for (int i = 0; i<ls.length; i++) {
//             int diff= Math.abs(ls[i] - rs[i]);
//             maxDiff = Math.max(maxDiff, diff);
//         }
//         return maxDiff;
//     }
// }

class Solution {
    public int findMaxDiff(int[] arr) {
        int n = arr.length;
        int[] ls = new int[n];
        int[] rs = new int[n];

        // Initialize first and last
        ls[0] = 0;
        rs[n - 1] = 0;

        // Fill left smaller array
        for (int i = 1; i < n; i++) {
            int min = 0;
            for (int j = i - 1; j >= 0; j--) {  // loop from i-1 to 0 (early break possible)
                if (arr[j] < arr[i]) {
                    min = arr[j];
                    break; // first smaller to the left, exit early
                }
            }
            ls[i] = min;
        }

        // Fill right smaller array
        for (int i = 0; i < n - 1; i++) {
            int min = 0;
            for (int j = i + 1; j < n; j++) { // loop from i+1 to end (early break possible)
                if (arr[j] < arr[i]) {
                    min = arr[j];
                    break; // first smaller to the right, exit early
                }
            }
            rs[i] = min;
        }

        // Compute max absolute difference
        int maxDiff = 0;
        for (int i = 0; i < n; i++) {
            int diff = Math.abs(ls[i] - rs[i]);
            maxDiff = Math.max(maxDiff, diff);
        }

        return maxDiff;
    }
}
