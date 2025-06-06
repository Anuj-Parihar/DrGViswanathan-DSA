class Solution {
    public static int minimumInteger(int N, int[] A) {
        long sum = 0;
        long min=Long.MAX_VALUE; 
        for(int i =0; i<N;i++) {
            sum +=A[i];
        }
        for(int i =0; i< N;i++) {
            if(sum <= (long)N*A[i]) { 
                if(A[i]<min) {
                    min =A[i];
                }
            }
        }
        return (int)min;
    }
}