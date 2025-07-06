// User function Template for Java
class Solution {
    public String longestCommonPrefix(String arr[]){
        String first =arr[0];
        int len = first.length();

        for (int i =0;i<len; i++){
            char c=first.charAt(i);
            for (int j = 1; j < arr.length; j++){
                if (i >= arr[j].length() || arr[j].charAt(i)!=c) {
                    return first.substring(0, i);
                }
            }
        }
        return first;
    }
}