// https://practice.geeksforgeeks.org/problems/surround-the-1s2505/1
class Surround_the_1s
{
    public int  Count(int[][] matrix)
    {
        // code here
        int ans=0;
        int m=matrix.length;
        int n=matrix[0].length;
        int[] row={-1,-1,0,1,1,1,0,-1};
        int[] col={0,1,1,1,0,-1,-1,-1};
        for(int i=0;i<m;i++){
            for(int j=0;j < n;j++){
                int count=0;
                if(matrix[i][j] == 1){
                    for(int k=0;k<8;k++){
                        int nr=i+row[k];
                        int nc=j+col[k];
                        if(nr >=0 && nr < m&& nc >=0 && nc <n && matrix[nr][nc] == 0)
                            count++;
                    }
                    if(count >0 && count %2 == 0)
                        ans++;
                }
            }
        }
        return ans;
    }
}
