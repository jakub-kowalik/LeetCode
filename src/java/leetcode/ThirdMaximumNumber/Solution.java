package leetcode.ThirdMaximumNumber;

import java.util.Arrays;

class Solution {
    public int thirdMax(int[] nums) {
        if (nums.length < 3) {
            Arrays.sort(nums);
            return nums[nums.length-1];
        }

        int answer = 0;
        int flag = 0;

        Arrays.sort(nums);

        for (int i = nums.length-1; i > 0; i--) {
            if (nums[i] > nums[i-1]) {
                answer = nums[i-1];
                flag++;
            }
            if (flag == 2)
                return answer;
        }

        return nums[nums.length-1];
    }
}
