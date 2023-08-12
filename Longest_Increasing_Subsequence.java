// https://practice.geeksforgeeks.org/problems/longest-increasing-subsequence-1587115620/1
class Longest_Increasing_Subsequence
{
    //Function to find length of longest increasing subsequence.
    static int longestSubsequence(int size, int arr[])
    {
        // code here
        int[] tail=new int[size];
       int  len=1;
       tail[0]=arr[0];
        for(int i=1;i<size;i++){
            if(arr[i] > tail[len-1]){
                tail[len]=arr[i];
                len++;
            }
            else
            {
                int c=ceilIdx(tail,0,len-1,arr[i]);
                tail[c]=arr[i];
            }
        }
        return len;
    }
    public static int ceilIdx(int[] tail,int l,int r,int x){
        while(r >l){
            int m=(l+r)/2;
            if(tail[m] >= x)
                r=m;
            else
                l=m+1;
        }
        return r;
    }
} 
