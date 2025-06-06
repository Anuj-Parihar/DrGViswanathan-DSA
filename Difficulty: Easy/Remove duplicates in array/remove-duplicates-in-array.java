class Solution {
    ArrayList<Integer> removeDuplicate(int arr[]) {
        // code here
        ArrayList<Integer>newarr = new ArrayList<>();
        Set<Integer> set = new LinkedHashSet<>();
        for(int num : arr){
            set.add(num);
        }
        for(int num : set){
            newarr.add(num);
        }
        return newarr;
    }
}