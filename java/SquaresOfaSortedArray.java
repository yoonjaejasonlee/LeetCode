import java.util.Arrays;

public class SquaresOfaSortedArray {
    public int[] sortedSquares(int[] nums) { //O(nlogn)
        int [] list = new int[nums.length];

        for(int i = 0 ; i<nums.length; i++){
            list[i] = nums[i] * nums[i];
        }

        Arrays.sort(list);

        return list; 
    }

    public int [] sortedSquares2(int []nums){ //O(n)
        int length = nums.length; 
        int [] list = new int[length];
        int left = 0; 
        int right = length-1; 

        for(int i = length-1; i>=0 ; i--){
            if(Math.abs(nums[left]) > Math.abs(nums[right])){
                list[i] = nums[left] * nums[left];
            }else{
                list[i] = nums[right] * nums[right];
            }
        }
        return list; 
    }
}
