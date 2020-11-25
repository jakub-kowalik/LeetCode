package leetcode.ArrayPartitionI;

import java.util.Arrays;

class Solution {
    public int arrayPairSum(int[] nums) {
        int[] arr = Arrays.copyOf(nums, nums.length);
        Arrays.sort(arr);
        int sum = 0;
        for (int i = 0; i < arr.length; i+=2) {
            sum += arr[i];
        }
        return sum;
    }
}
