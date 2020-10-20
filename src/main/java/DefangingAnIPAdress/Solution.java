package main.java.DefangingAnIPAdress;

class Solution {
    public String defangIPaddr2(String address) {
        return address.replace(".", "[.]");
    }

    public String defangIPaddr(String address) {
        StringBuilder stringBuilder = new StringBuilder();
        int length = address.length();
        for (int i = 0; i < length; i++) {
            if (address.charAt(i) == '.') {
                stringBuilder.append("[.]");
            } else {
                stringBuilder.append(address.charAt(i));
            }
        }
        return stringBuilder.toString();
    }
}
