// User function Template for Java

class Solution {
    // Function to modify the matrix such that if a matrix cell matrix[i][j]
    // is 1 then all the cells in its ith row and jth column will become 1.
    void booleanMatrix(int mat[][]) {
        // code here
        int n = mat.length;
        int m = mat[0].length;
          int rows [] = new int[n];
        int cols [] = new int[m];
        for(int i =0;i<n;i++){
            for (int j =0; j<m; j++){
                if(mat[i][j] == 1){
                    rows[i]=1;
                    cols[j] =1;
                }
            }
        }
        for(int i =0;i<n;i++){
            for (int j =0; j<m; j++){
                if(rows[i]==1 || cols[j]==1){
                    mat[i][j] = 1;
                }
            }
        }
        
    }
}