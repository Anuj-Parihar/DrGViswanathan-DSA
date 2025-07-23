class Solution {
    
    public ArrayList<String> findPermutation(String s) {
        // Code here
        ArrayList<String> ans = new ArrayList<>();
        char[] chars = s.toCharArray();
        getPerms(chars,0,ans);
        return ans;
    }
    private void getPerms(char[] chars, int idx, ArrayList<String> ans){
        if(idx == chars.length){  //base condition
            ans.add(new String(chars));
            return;
        }
        HashSet<Character> used = new HashSet<>();
        for(int i = idx;i<chars.length;i++){
            if (used.contains(chars[i])) 
                continue; // Skip duplicate characters at this level
            used.add(chars[i]);
            // Place ith character at idx
            char temp = chars[idx];
            chars[idx] = chars[i];
            chars[i]= temp;
            
            getPerms(chars,idx+1,ans);
            //backtracking
            char temp1 = chars[idx];
            chars[idx] = chars[i];
            chars[i]= temp1;
        }
    }
}                                              