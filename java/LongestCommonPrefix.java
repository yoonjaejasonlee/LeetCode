public class LongestCommonPrefix {
    public String longestCommonnPrefix(String [] strs){
        String answer = "";
        if(strs.length == 0){
            return answer; 
        }

        answer = strs[0];

        for(int i = 0; i<strs.length; i++){
            String current = strs[i];

            while(current.indexOf(answer) != 0){
                answer = answer.substring(0, answer.length()-1);
            }
        }
        
        return answer;
    }
}
