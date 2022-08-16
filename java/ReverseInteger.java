/* 7. Reverse Integer 
Given a signed 32-bit integer x, return x with its digits reversed. 
If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0. */

public class ReverseInteger {
    public static int reverse(int x){
       long reversed = 0;

       while(x != 0){
           reversed = (reversed * 10) + (x%10);
           x /= 10; 
       }

       return (int)reversed == reversed ? (int)reversed : 0 ;  //boolean ? if true: if false; 
    }
}
