class Solution {
    public int numTilings(int n) {
        if(n == 1) return 1;
        if(n == 2) return 2;
        
        long[] dp = new long[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 5;

        for (int i = 4; i <= n; i++) {
            dp[i] = (2 * dp[i - 1] + dp[i - 3]) % 1000000007;
        }

        return (int) dp[n];
    }
}