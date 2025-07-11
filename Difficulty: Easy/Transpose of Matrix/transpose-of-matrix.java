class Solution {
    public ArrayList<ArrayList<Integer>> transpose(int[][] mat) {
        int n = mat.length;         // number of rows
        int m = mat[0].length;      // number of columns

        ArrayList<ArrayList<Integer>> result= new ArrayList<>();
        for (int i =0; i<m; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j=0; j<n;j++) {
                row.add(mat[j][i]);
            }
            result.add(row);
        }

        return result;
    }
}
