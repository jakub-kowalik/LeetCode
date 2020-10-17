package main.java.HammingDistance;

class Solution {
    public int hammingDistance(int x, int y) {
        int z = x^y;

        String str = Integer.toBinaryString(z);

        int temp = 0;
        for (char character : str.toCharArray()) {
            if (character == '1') {
                temp++;
            }
        }
        return temp;
    }
}
