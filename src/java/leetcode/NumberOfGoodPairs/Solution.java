package leetcode.NumberOfGoodPairs;

import java.util.Arrays;

class Solution {
    public int numIdenticalPairs2(int[] nums) {
        int answer = 0;

        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                    if (nums[i] == nums[j]) {
                        answer++;
                    }
            }
        }
        return answer;
    }

    public int numIdenticalPairs(int[] nums) {
        int[] counter = new int[101];
        int answer = 0;

        for (int number : nums) {
            answer += counter[number]++;
        }

        return answer;
    }

}
