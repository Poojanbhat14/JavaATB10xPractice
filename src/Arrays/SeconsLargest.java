package Arrays;

import java.util.Arrays;

public class SeconsLargest {
    public static void main(String[] args) {
        int[] nums={34,78,23,77,89,85};
        Arrays.sort(nums);
        for (int i=0;i<nums.length; i++){
            System.out.println(nums[i]);
        }
        System.out.println(nums[nums.length-2]);
    }
}
