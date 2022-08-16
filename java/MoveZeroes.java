import javax.xml.transform.Templates;

public class MoveZeroes {
    public void moveZero(int []nums){
        if(nums.length == 0){
            return;
        }

        int current = 0; 

        for(int i =0 ; i< nums.length; i++){
            if(nums[i] != 0){
                int temp = nums[current];
                nums[current] = nums[i];
                nums[i] = temp;

                current++;
            }
        }
    }
}
