// https://practice.geeksforgeeks.org/problems/longest-common-subsequence-1587115620/1
class Longest_Common_Subsequence
{
    //Function to find the length of longest common subsequence in two strings.
    
    static int lcs(int x, int y, String s1, String s2)
    {
        // your code here
        int[][] memo=new int[x+1][y+1];
        for(int i=0;i<memo.length;i++){
            Arrays.fill(memo[i],-1);
        }
        return largestSubSequence(x,y,s1,s2,memo);
            
    }
    public static int largestSubSequence(int x,int y,String s1,String s2,int[][] memo){
            if(memo[x][y] != -1)
                return memo[x][y];
            if(x==0 || y==0){
                memo[x][y]=0;
            }
            else{
                if(s1.charAt(x-1) == s2.charAt(y-1))
                    memo[x][y]=1+largestSubSequence(x-1,y-1,s1,s2,memo);
                else
                    memo[x][y]=Math.max(largestSubSequence(x-1,y,s1,s2,memo),
                                            largestSubSequence(x,y-1,s1,s2,memo));
            }
            return memo[x][y];
    }
    
}
