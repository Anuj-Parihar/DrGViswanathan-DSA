class Solution {
    public static boolean matSearch(int mat[][], int x) {
        // your code here
        int n = mat.length;         // number of rows
        int m = mat[0].length;      // number of columns
         for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j] == x){
                    return true;
                }
            }
        }
        return false;
    }
}