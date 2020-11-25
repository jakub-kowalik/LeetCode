package leetcode.ShuffleString;

class Solution {
    public String restoreString(String s, int[] indices) {
        boolean isSorted = false;
        char[] chars = s.toCharArray();
        int tempInt;
        char tempChar;

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < indices.length - 1; i++) {
                if (indices[i] > indices[i + 1]) {
                    tempInt = indices[i];
                    indices[i] = indices[i + 1];
                    indices[i + 1] = tempInt;

                    tempChar = chars[i];
                    chars[i] = chars[i + 1];
                    chars[i + 1] = tempChar;
                    isSorted = false;
                }
            }
        }

        return String.valueOf(chars);
    }
}
