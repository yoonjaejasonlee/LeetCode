/* 118. Pascal's Triangle 
Given an integer numRows, return the first numRows of Paschal's Triangle */

import java.util.*;
import java.util.ArrayList;


public class PascalsTriangle {

    public static void main(String[]args){

        System.out.println(generate(5));
    }
    public static List<List<Integer>> generate (int numRows) {
        List<List<Integer>> triangle = new ArrayList<>(); //리턴을 줄 리스트 생성

        if(numRows == 0) return triangle; //만약에 0 이라면 비어있는 triangle을 리턴

        List<Integer> firstRow = new ArrayList<>(); //첫번째줄 생성; 
        firstRow.add(1); //첫번째 줄은 항상 1이기때문에 1을 넣어줌
        triangle.add(firstRow); //리턴값에 첫번쨰 줄을 삽입.

        for(int i = 1 ; i< numRows; i++){ 
            List<Integer> previousRow = triangle.get(i-1); // 바로 전줄을 나타내는 리스트 생성
            List<Integer> row = new ArrayList<>(); //현재 어레이

            row.add(1); //어레이에서의 첫번째 값은 항상 1임 

            for(int j = 1; j<i ; j++){
                row.add(previousRow.get(j-1) + previousRow.get(j)); //전줄에서  j-1 값과 j 값을 더해줌
            }

            row.add(1); //마지막 값도 항상 1임 

            triangle.add(row); // 다 만들어진 줄을 리턴값에 넣어줌.
        
        }
        return triangle; 
    }
}
