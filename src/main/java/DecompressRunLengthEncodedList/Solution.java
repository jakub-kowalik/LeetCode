package main.java.DecompressRunLengthEncodedList;

import java.util.Arrays;

class Solution {
    public int[] decompressRLElist(int[] nums) {
        int arrayLength = 0;
        int[] answer;
        int iterator = 0;

        for (int i = 0; i < nums.length / 2; i++) {
            arrayLength += nums[i * 2];
            System.out.println(nums[i * 2]);
        }

        answer = new int[arrayLength];

        for (int i = 0; i < nums.length / 2; i++) {
            for (int j = 0; j < nums[i * 2]; j++) {
                answer[iterator++] = nums[i * 2 + 1];
            }
        }

        return answer;
    }

}
