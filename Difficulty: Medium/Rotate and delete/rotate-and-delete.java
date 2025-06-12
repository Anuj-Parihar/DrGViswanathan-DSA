
class Solution {
    public static int rotateDelete(ArrayList<Integer> arr) {
        int sz = arr.size();
        int n = sz;
        for(int i=1; i<= sz/2; i++){
            int last = arr.remove(arr.size()-1);
            arr.add(0,last);
            
            int indexDel = n-i;
            if(indexDel>=0 && indexDel<arr.size()){
                arr.remove(indexDel);
            }
            n--;
        }
        return arr.get(0);
    }
}
