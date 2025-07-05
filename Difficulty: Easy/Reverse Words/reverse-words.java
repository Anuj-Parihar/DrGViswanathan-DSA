class Solution {
    // Function to reverse words in a given string
    public String reverseWords(String s) {
        // Code here
        String[] words = s.trim().split("\\s+"); 
        String newStr="";
           for (int i = words.length - 1; i >= 0; i--) {
                newStr +=words[i];
            if (i != 0) {
                newStr += " ";
            }
        }
         return newStr;
    }
}
