package solution.dynamicProgramming.easy;

public class ClimbStairs {

    static int climbStairs(int n) {
//        return bruteForce(0, 3);
        int[] memo = new int[n+1];
        return recurseWithMem(0, n, memo);
    }


    //time complexity O(2^n), space complexity O(n = depth of recursion)
    static int bruteForce(int i, int n) {
        if (i > n)
            return 0;
        if (i == n)
            return 1;
        return bruteForce(i+1, n) + bruteForce(i+2, n);
    }

    static int recurseWithMem(int i, int n, int memo[]) {
        if (i > n)
            return 0;
        if (i == n)
            return 1;
        if (memo[i] > 0)
            return memo[i];
        memo[i] = recurseWithMem(i+1, n, memo) + recurseWithMem(i+2, n, memo);
        return memo[i];
    }

    static int dynamicProgramming(int n) {
        if (n == 1) {
            return 1;
        }
        int[] dp = new int[n+1];
        dp[1] = 1; //1 way, 1
        dp[2] = 2; //2 ways, 1+1 or 2
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(dynamicProgramming(4));
    }
}
