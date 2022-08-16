import java.util.*;

public class GenerateParentheses {
    public List<String> generateParentehese(int n){
        ArrayList<String> list = new ArrayList();

        backtracking(list, "", 0, 0, n);

        return list; 

    }

    public void backtracking(List<String> list, String Current_String, int open, int close, int max){
        if(Current_String.length() == max*2){
            list.add(Current_String);
            return; 
        }

        if(open<max){
            backtracking(list, Current_String+"(", open+1, close, max);
        }

        if(close<open){
            backtracking(list, Current_String+")", open, close+1, max);
        }
    }
}
