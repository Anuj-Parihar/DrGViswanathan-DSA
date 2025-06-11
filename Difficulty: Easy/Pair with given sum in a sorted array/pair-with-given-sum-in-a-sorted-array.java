// User function Template for Java

class Solution {

    // int countPairs(int arr[], int target) {
    //         int count =0;
    //     for(int i =0; i<arr.length-1; i++){
    //         for(int j =i+1; j<arr.length; j++){
    //         int sum =arr[i]+arr[j];
    //             if(sum == target){
    //                 count++;
    //             }
    //         }
    //     }
    //     return count;
    // }
    
    
    int countPairs(int arr[], int target) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int count=0;
        for (int num : arr) {
            int complement = target-num;
            if (map.containsKey(complement)) {
                count+=map.get(complement);
            }
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return count;
    }
}
