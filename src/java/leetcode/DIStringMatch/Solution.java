package leetcode.DIStringMatch;

import java.util.Arrays;

class Solution {
    public int[] diStringMatch(String S) {
        int N = S.length();
        int[] numberArray = new int[N + 1];

        int low = 0;
        int high = N;

        for (int i = 0; i < N; ++i) {
            if (S.charAt(i) == 'I')
                numberArray[i] = low++;
            else if (S.charAt(i) == 'D')
                numberArray[i] = high--;
        }
        numberArray[N] = low;

        return numberArray;
    }

}
