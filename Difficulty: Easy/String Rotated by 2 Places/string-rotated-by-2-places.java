class Solution {
    public static boolean isRotated(String s1, String s2) {
        if(s1.length() != s2.length() || s1.length()<2){
            return false;
        }
        int n = s1.length();
        // Left rotate
        String leftRot=s1.substring(2)+s1.substring(0,2);
        // Right rotate
        String rightRot = s1.substring(n-2)+ s1.substring(0,n-2);
        if(s2.equals(leftRot) || s2.equals(rightRot)){
            return true;
        }
        return false;
    }
}
