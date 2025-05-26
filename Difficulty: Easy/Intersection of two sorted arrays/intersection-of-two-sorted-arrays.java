// User function Template for Java

class Solution {
    // Function to return a list containing the intersection of two arrays.
    static ArrayList<Integer> intersection(int arr1[], int arr2[]) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        int i =0;
        int j =0;
        // int k =0;
        int n = arr1.length;
        int m = arr2.length;
        while(i< n && j<m){
            if(arr1[i] == arr2[j]){
                treeSet.add(arr1[i]);
                i++;
                j++;
            }else if (arr1[i] < arr2[j]) {
                    i++;
            } else {
                j++;
            }
        }
       return new ArrayList<>(treeSet);
    }
}
