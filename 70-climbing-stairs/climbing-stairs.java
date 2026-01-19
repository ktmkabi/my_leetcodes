class Solution {
    public int climbStairs(int n) {
        if (n == 1) return 1;
        int first = 1;
        int second = 2;
        if (n == 2) return 2;
        int ways = 0;
        for (int i = 3; i <= n; i++) {
            ways = first + second;//n-1+n-2
            first = second;
            second = ways;//Last step = 1 → I was at n-1
                          //Last step = 2 → I was at n-2
        }
        return ways;
    }
}