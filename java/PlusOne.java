public class PlusOne {
    public int[] plusOne(int[] digits) {
        int n = digits.length; 
        int [] value = new int[n+1];
        value[0] = 1; 

        for(int i = n-1; i>=0 ;i-- ){
            if(digits[i]< 9){
                digits[i]++; 
                         //1, 2, 9
                return digits; 
            }else{
                digits[i] = 0; 
            }
        }
        return value;
    }
}
