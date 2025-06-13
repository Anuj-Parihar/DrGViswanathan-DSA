class Solution {
    public List<Integer> rearrange(List<Integer> arr) {
        List<Integer> result = new ArrayList<>();
        for(int i =0; i<arr.size(); i++){
            result.add(i,-1);
        }
        for (int val:arr) {
            if (val>=0 && val<arr.size()) {
                result.set(val,val);
            }
        }
        return result;
    }
}