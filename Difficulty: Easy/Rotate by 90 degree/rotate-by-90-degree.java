class Solution {
    public void rotateMatrix(int[][] mat) {
        // code here
          int n = mat.length;         // number of rows
        int m = mat[0].length;      // number of columns
        int[][] rotated =new int[m][n];
         for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               rotated[m-1-j][i] = mat[i][j];
            }
        }
         for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                mat[i][j] =rotated[i][j];
            }
        }
    }
}