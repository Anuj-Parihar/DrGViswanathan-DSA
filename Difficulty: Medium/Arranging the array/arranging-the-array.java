// User function Template for Java

class Solution {

    public void Rearrange(int a[], int n) {
        // int arrnew [] = new int [a.length];
        ArrayList<Integer> arrnew = new ArrayList<>(); 
        for(int i =0;i<a.length; i++){
            if(a[i]<0){
                arrnew.add(a[i]);
            }
        }
        for(int i=0; i<a.length; i++){
            if(a[i]>=0){
                arrnew.add(a[i]);
            }
        }
        for(int i =0;i<a.length; i++){
            a[i] = arrnew.get(i);
        }
        
    }
}