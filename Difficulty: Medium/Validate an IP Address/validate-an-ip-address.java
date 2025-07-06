class Solution {

    public boolean isValid(String s) {
        // Write your code here
        
        String[] cells = s.split("\\.");
        // need 4 cells
        if(cells.length!=4){
            return false;
        }
        //each cell does't empty
        for(String cell : cells){
            if(cell.isEmpty()){
                return false;
            }
            //contain only digits 
           for(char ch : cell.toCharArray()){
                if(!Character.isDigit(ch)){
                    return false;
                }
            }
            //check 0 at starting in each cell
            if(cell.length()>1 && cell.charAt(0)=='0'){
                return false;
            }
            //check each cell length
            int num;
            num = Integer.parseInt(cell);
            if(num < 0 || num > 255){
                return false;
            }
        }
        return true;
    }
}