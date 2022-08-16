import java.util.*; 
public class ReverseWordsInaStringIII {
    public String reverseWords(String s){
        String [] list = s.split(" ");

        String answer = "";

        for(int i = 0 ; i < list.length; i++){
            StringBuilder sb = new StringBuilder(list[i]);

            sb.reverse();
            
            if(i<list.length-1){
                answer += sb.toString()+" ";
            }else{
                answer += sb.toString();
            }
        }

        return answer;
    }
}
