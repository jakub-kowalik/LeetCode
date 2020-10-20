package main.java.NumberofStepstoReduceaNumbertoZero;

class Solution {
    public int numberOfSteps (int num) {
        int answer = 0;

        while (num != 0) {
            if (num % 2 != 0) {
                num--;
                answer++;
            } else {
                num /= 2;
                answer++;
            }
        }
        return answer;
    }
}
