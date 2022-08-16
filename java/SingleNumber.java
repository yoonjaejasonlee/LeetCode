public class SingleNumber {
    public int singleNmuber(int[] nums){
        int i = 0;
        int j = 1;

        while(i< nums.length){ 
            if(nums[i] == nums[j]){
                i = j+1; 
            }
          
        }
        return nums[i];
    }

}
