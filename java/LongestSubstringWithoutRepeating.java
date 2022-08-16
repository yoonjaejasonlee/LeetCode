import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeating {
    public int lengthOfLongestSubstring(String s) {
        int left = 0 ; int right = 0; int max = 0; 
        Set<Character> set = new HashSet<>(); //Set은 중복된 value 를 가질수없음. 

        while(right < s.length()){ //right 포인터는 계속 해서 우측을 전진. 
            if(!set.contains(s.charAt(right))){ 
                set.add(s.charAt(right++));
                max = Math.max(max, set.size());
            }else{
                set.remove(s.charAt(left++));
            }
        }

        return max; 
    }
}
