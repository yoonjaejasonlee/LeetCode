/* 119. Pascal's Triangle II 
Given an intger rowIndex, return the rowIndexth row of pascal's triangle */


import java.util.*;
public class PascalsTriangle2 {
    public List<Integer> getRow(int rowIndex){
        List<Integer> triangle = new ArrayList<>();
        
        for(int i = 0; i< rowIndex; i++){
            triangle.add(1);

            for(int j = i-1; j > 0 ; j--){
                triangle.set(j, triangle.get(j-1) + triangle.get(j));
            }
        }
        return triangle; 
    }
}
