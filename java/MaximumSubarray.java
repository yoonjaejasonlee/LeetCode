//get the largest sum from a contiguous subarray from an array.
//53. Maximum Subarray

//Uses Kadanes Algorithm
public class MaximumSubarray {
    public int maxSubArray(int[]nums){
       int max_sum = nums[0]; //array안에 있는 맨 첫번째 value 로 설정
       int current_sum = max_sum; //array안에 있는 맨 첫번째 value 로 설정

       for(int i =1; i<nums.length; i++){
           current_sum = Math.max(nums[i] + current_sum, nums[i]); //nums[i]의 값과 nums[i]+current sum 중에서 더 큰값을 current sum으로 둔다.
           max_sum = Math.max(current_sum, max_sum); //current sum과 max sum중에 더 큰값이 max sum이 된다. 
       }
       return max_sum; 
    }
}
