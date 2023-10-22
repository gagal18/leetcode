package exercise1;

import java.util.Arrays;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] indices = {0,0};
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target){
                    indices = new int[]{i, j};
                }
            }
        }
        return indices;
    }

    public static void main(String[] args) {
        int[] test1 = {1,3,4,2};
        int[] sol1 = TwoSum.twoSum(test1, 6);
        System.out.println(Arrays.toString(sol1));
    }
}