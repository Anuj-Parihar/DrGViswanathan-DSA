class Solution {
    public boolean areIsomorphic(String s1, String s2) {
        // code here
        if(s1.length() != s2.length()){
            return false;
        }
        int [] new1 = new int[256];
        int [] new2 = new int[256];
        
        for(int i=0;i<s1.length();i++){
           char c1 = s1.charAt(i);
           char c2 = s2.charAt(i);
           
           if(new1[c1]==0 && new2[c2]==0){
               new1[c1]= c2;
               new2[c2]=c1;
           }else{
               //mapping
               if(new1[c1]!=c2 || new2[c2]!=c1){
                    return false;
               }
           }
        }
        return true;
    }
}