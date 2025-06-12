import java.util.*;

class Solution {
    public ArrayList<Integer> firstAndLast(int x, int arr[]) {
        ArrayList<Integer> result = new ArrayList<>();
        int n = arr.length;
        int first =-1,last =-1;
        int low = 0, high=n-1;
        while (low<=high){
            int mid = low+(high-low) / 2;
            if (arr[mid] == x) {
                first = mid;
                high = mid - 1;  
            } else if(arr[mid] < x){
                low = mid+1;
            } else{
                high = mid-1;
            }
        }
        if (first==-1) {
            result.add(-1);
            return result;
        }
        low=0;
        high = n -1;
        while (low <=high){
            int mid = low+(high-low) / 2;
            if (arr[mid] == x) {
                last = mid;
                low = mid+1;  
            } else if(arr[mid]<x) {
                low=mid+1;
            } else{
                high=mid-1;
            }
        }
        result.add(first);
        result.add(last);
        return result;
    }
}
