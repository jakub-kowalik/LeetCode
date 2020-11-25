package leetcode.ShuffleTheArray;

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] answer = new int[2 * n];

        for (int i = 0, j = n, index = 0; index < nums.length; i++, j++) {
            answer[index++] = nums[i];
            answer[index++] = nums[j];
        }

        return answer;
    }
}
