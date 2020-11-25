package leetcode.MaximumNestingDepthoftheParentheses;

class Solution {
    public int maxDepth(String s) {
        int answer = 0;
        int currentDepth = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                currentDepth++;
                if (currentDepth > answer)
                    answer = currentDepth;
            } else if (s.charAt(i) == ')') {
                currentDepth--;
            }
        }
        return answer;
    }
}
