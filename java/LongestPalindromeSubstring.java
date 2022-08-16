public class LongestPalindromeSubstring {
    public static String longestPalindrome(String s) {
        int start = 0; 
        int end = 0; 

        for(int i = 0; i< s.length(); i++){
            int L1 = ExpandFromTheMiddle(s, i, i); // ex) abcacb
            int L2 = ExpandFromTheMiddle(s, i, i+1); // ex) aabbaa

            int max = Math.max(L1, L2);

            if(max > end - start){
                start = i - ((max - 1) /2 );
                end = i + (max /2); 
            }
        }
        return s.substring(start, end +1);
    }

    public static int ExpandFromTheMiddle(String s, int left, int right){
        if(s == null || left> right){
            return 0;
        }
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--; 
            right++; 
        }

        return right - left - 1; 
    }
    
}
