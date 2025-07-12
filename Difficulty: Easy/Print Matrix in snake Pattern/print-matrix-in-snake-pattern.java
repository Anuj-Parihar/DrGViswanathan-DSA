// User function Template for Java

class Solution {
    // Function to return list of integers visited in snake pattern in matrix.
    static ArrayList<Integer> snakePattern(int matrix[][]) {
        // code here
        ArrayList<Integer> arr = new ArrayList<>();
        int n = matrix.length; // legnth of rows
         int m = matrix[0].length;//legnth of colomn
         int rowStart = 0;
         int rowEnd = n-1;
         int colStart = 0;
         int colEnd = m-1;
          while(rowStart <= rowEnd && colStart <= colEnd){
              for(int col=colStart; col<=colEnd; col++) {
                  arr.add(matrix[rowStart][col]);
              }
              rowStart++;
              
              if(rowStart <= rowEnd){
                  for(int col=colEnd; col>=colStart; col--){
                      arr.add(matrix[rowStart][col]);
                  }
                  rowStart++;
              }
          }         
        return arr;
        
        // ArrayList<Integer> arr = new ArrayList<>();
        // int n = matrix.length; // number of rows
        // int m = matrix[0].length; // number of columns
        // for (int i = 0; i < n; i++){
        //     if (i%2==0) {
        //         for (int j =0;j<m; j++) {
        //             arr.add(matrix[i][j]);
        //         }
        //     } else{
        //         for (int j =m-1; j>=0;j--) {
        //             arr.add(matrix[i][j]);
        //         }
        //     }
        // }
        // return arr;
    }
}