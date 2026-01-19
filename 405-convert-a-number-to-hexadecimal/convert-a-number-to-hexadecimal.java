class Solution {
    public String toHex(int num) {
        if (num == 0) {
            return "0";
        }
        String result = "";
        while (num != 0) {
            int rem = num & 15;   // last 4 bits (0–15)
            char hexChar;
            if (rem < 10) {
                hexChar = (char) ('0' + rem);
            } else {
                hexChar = (char) ('a' + (rem - 10));
            }
            result = hexChar + result;
            num = num >>> 4;
        }
        return result;   
    }
}