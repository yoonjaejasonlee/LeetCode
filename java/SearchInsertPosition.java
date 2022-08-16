public class SearchInsertPosition {
    public int searchInsert(int [] nums, int target){
        int index = 0;

        while(index <= nums.length-1){
            if(nums[index] < target){
                index++;
            }else if(nums[index]>= target){
                return index;
            }
        }

        return index; 
    }
}
