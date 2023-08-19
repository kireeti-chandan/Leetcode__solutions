// https://leetcode.com/problems/climbing-stairs/description/
class Climbing_Stairs {
    public int climbStairs(int n) {
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        int res=climb(n,dp);
        return dp[n];
    }
    public static int climb(int n,int[] dp){
        if(n == 0)
            return 1;
        else if(n < 0)
            return 0;
        if(dp[n] != -1)
            return dp[n];
        dp[n]=climb(n-2,dp)+climb(n-1,dp);
        return dp[n];
    }
}
