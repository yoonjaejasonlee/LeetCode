public class PalindromeNumber {
    public boolean isPalindrome(int x){

        int temp = x;
        int sum = 0; 
        int remainder = 0;  

        while(temp>0){
            remainder = temp%10; 
            sum = (sum *10) + remainder; 
             
            temp /= 10; 
        }

        if(temp == x){
            return true;
        }else{
            return false; 
        }
    }
}
