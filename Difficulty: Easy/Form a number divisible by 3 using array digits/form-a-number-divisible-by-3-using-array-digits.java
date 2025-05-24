// User function Template for Java
class Solution {
    
    static int isPossible(int N, int arr[]) {
        int eachDigitSum = 0;

        for (int num :arr) {
            while (num >0) {
                eachDigitSum+=num%10;
                num /= 10;
            }
        }
        if(eachDigitSum %3 == 0){
            return 1;
        }
        return 0;
    }
}
