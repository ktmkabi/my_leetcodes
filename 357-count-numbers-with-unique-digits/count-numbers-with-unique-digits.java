class Solution {
    public int countNumbersWithUniqueDigits(int n) {
       
        if (n == 0) return 1;

        int result = 10;   
        int u = 9;    
        int a = 9; 

        for (int i = 2; i <= n && a > 0; i++) {
            u = u * a;
            result += u;
            a--;
        }

        return result; 
    }
}