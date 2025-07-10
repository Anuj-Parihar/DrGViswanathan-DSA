class Solution {
    public ArrayList<Integer> spirallyTraverse(int[][] mat) {
        // code here
        ArrayList<Integer> arr = new ArrayList<>();
         int n = mat.length; // legnth of rows
         int m = mat[0].length;//legnth of colomn
         int rowStart = 0;
         int rowEnd = n-1;
         int colStart = 0;
         int colEnd = m-1;
          while(rowStart <= rowEnd && colStart <= colEnd){
              for(int col=colStart; col<=colEnd; col++) {
                  arr.add(mat[rowStart][col]);
              }
              rowStart++;
              for(int row=rowStart; row<=rowEnd; row++){
                  arr.add(mat[row][colEnd]);
              }
              colEnd--;
              if(rowStart <= rowEnd){
                  for(int col=colEnd; col>=colStart; col--){
                      arr.add(mat[rowEnd][col]);
                  }
                  rowEnd--;
              }
              if(colStart <=colEnd){ 
                  for(int row=rowEnd; row>=rowStart; row--){
                      arr.add(mat[row][colStart]);
                  }
                  colStart++;
              }
          }         
        return arr;
    }
}
