import java.util.HashSet;

class Compute {
    boolean find4Numbers(int A[], int n, int X) {
        for (int i=0;i<n-3;i++) {
            for (int j=i+1;j<n-2; j++) {
                int remain = X-(A[i]+A[j]);
                HashSet<Integer>set = new HashSet<>();
                for (int k=j+1; k<n; k++) {
                    if (set.contains(remain - A[k])) {
                        return true; 
                    }
                    set.add(A[k]);
                }
            }
        }
        return false;
    }
}
