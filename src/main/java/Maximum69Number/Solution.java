package main.java.Maximum69Number;

class Solution {
    public int maximum69Number (int num) {
        String stringNum = String.valueOf(num);
        char[] charArray = stringNum.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == '6') {
                charArray[i] = '9';
                break;
            }
        }
        return Integer.parseInt(String.valueOf(charArray));
    }
}
