package main.java.NRepeatedElementInSize2NArray;

class Solution {
    public int repeatedNTimes(int[] A) {
        for (int i = 0; i < A.length; i++) {
            int temp = 0;
            for (int j = 0; j < A.length; j++) {
                if (A[i] == A[j]) {
                    temp++;
                }
                if (temp > 1) {
                    return A[i];
                }
            }
        }
        return 0;
    }
}
