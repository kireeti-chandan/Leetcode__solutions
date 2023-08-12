// https://practice.geeksforgeeks.org/problems/coin-change2448/1
class Coin_Change {
    public long count(int coins[], int n, int sum) {
        // code here.
        long[][] dp=new long[sum+1][n+1];
        for(int i=0;i<n+1;i++)
            dp[0][i]=1;
        for(int i= 1;i<sum+1;i++)
            dp[i][0]=0;
        for(int i=0;i<=sum;i++)
        {
            for(int j=1;j<=n;j++){
                dp[i][j]=dp[i][j-1];
                if(coins[j-1] <=i)
                    dp[i][j]+=dp[i-coins[j-1]][j];
            }
        }
        return dp[sum][n];
    }
}
