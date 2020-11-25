package leetcode.ReverseInteger;

class Solution {
    public int reverse(int x) {
        int flag = 0;
        if (x < 0) {
            x *= -1;
            flag = 1;
        }

        StringBuilder str = new StringBuilder(Integer.toString(x));
        try {
            int answer = new Integer(String.valueOf(str.reverse()));

            if (flag == 1)
                answer *= -1;

            return answer;
        } catch (NumberFormatException e) {
            return 0;
        }
    }

}
