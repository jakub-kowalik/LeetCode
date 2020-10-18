package main.java.LuckyNumbersInAMatrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            int maxRow = 0;
            int maxCol = 0;
            int numberR = 0;
            int numberC = 0;

            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] < matrix[i][maxCol]) {
                    maxCol = j;
                    numberC = matrix[i][j];
                } else {
                    numberC = matrix[i][maxCol];
                }
            }
            for (int k = 0; k < matrix.length; k++) {
                if (matrix[k][maxCol] > matrix[maxRow][maxCol]) {
                    maxRow = k;
                    numberR = matrix[k][maxCol];
                } else {
                    numberR = matrix[maxRow][maxCol];
                }
            }
            if (numberC == numberR) {
                answer.add(matrix[maxRow][maxCol]);
            }
        }
        return answer;
    }

}
