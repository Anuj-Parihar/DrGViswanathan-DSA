class Solution {
    static char nonRepeatingChar(String s) {
        // code here
        for(int i =0; i<s.length(); i++){
            boolean isrep = false;
            for(int j=0;j<s.length(); j++){
                if(i!=j && s.charAt(i) == s.charAt(j)){
                    isrep = true;
                    break;
                }
            }
            if(!isrep){
                return s.charAt(i);
            }
        }
        return '$';
    }
}
