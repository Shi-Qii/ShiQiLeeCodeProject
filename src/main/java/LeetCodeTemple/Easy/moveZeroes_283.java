package LeetCodeTemple.Easy;

import java.util.Arrays;

public class moveZeroes_283 {

    public static void main(String[] args) {
        int[] testInt= {0,0,1,2,3,4};
        int[] test= moveZeroes(testInt);
        System.out.println(Arrays.toString(test));
    }

    public static int[] moveZeroes(int[] nums) {
        int i = 0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=0){
                nums[i++]=nums[j];
            }
        }
        for(int result=i;result<nums.length;result++){
            nums[result]=0;
        }
        return nums;
    }
}
