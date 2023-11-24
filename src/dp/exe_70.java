package dp;

import java.util.Arrays;

public class exe_70 {
    public static int climbStairs(int n) {
        int dp[] = new int[n+1];
        dp[0] = dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int stairs5 = climbStairs(4);
        System.out.println(stairs5);
    }
}
