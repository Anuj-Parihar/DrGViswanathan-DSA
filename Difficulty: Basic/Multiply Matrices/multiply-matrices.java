/*Complete the function below*/
class GfG {
    public static void multiply(int A[][], int B[][], int C[][], int N) {
        for(int i =0;i<N;i++){
            for(int j=0;j<N;j++){
                for(int k=0;k<N;k++){
                    C[i][j] +=A[i][k] * B[k][j]; 
                }
            }
        }
    }
}