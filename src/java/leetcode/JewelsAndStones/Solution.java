package leetcode.JewelsAndStones;

class Solution {
    public int numJewelsInStones(String J, String S) {
        int lengthOfS = S.length();
        int lengthOfJ = J.length();
        int answer = 0;

        for (int i = 0; i < lengthOfS; i++) {
            for (int j = 0; j < lengthOfJ; j++) {
                if (J.charAt(j) == S.charAt(i)) {
                    answer++;
                }
            }
        }
        return answer;
    }
}
