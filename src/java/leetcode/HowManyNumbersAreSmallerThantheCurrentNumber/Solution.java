package leetcode.HowManyNumbersAreSmallerThantheCurrentNumber;

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] answer = new int[nums.length];

        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer.length; j++) {
                if (i != j) {
                    if (nums[i] > nums[j]) {
                        answer[i]++;
                    }
                }
            }
        }
        return answer;
    }
}
