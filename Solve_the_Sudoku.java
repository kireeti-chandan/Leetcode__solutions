class Solve_the_Sudoku
{
    //Function to find a solved Sudoku. 
    static boolean SolveSudoku(int grid[][])
    {
        // add your code here
        
        int N=grid.length;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(grid[i][j] == 0){
                    for(int n=1;n<=N;n++){
                    if(isSafe(grid,i,j,n,N)){
                        grid[i][j]=n;
                        if(SolveSudoku(grid))
                            return true;
                        else
                            grid[i][j]=0;
                        }
                    }
                return false;
                }
            }
        }
        return true;
    }
    
     static boolean isSafe(int[][] grid,int i,int j,int n,int N){
        for(int k=0;k<N;k++){
            if(grid[k][j] == n || grid[i][k] == n)
                return false;
        }
        int s=(int)Math.sqrt(N);
        int rs=i - i%s;
        int cs=j - j%s;
        for(i=0;i<s;i++){
            for(j=0;j<s;j++){
                if(grid[i+rs][j+cs] == n)
                    return false;
            }
        }
        return true;
    }
    //Function to print grids of the Sudoku.
    static void printGrid (int grid[][])
    {
        // add your code here
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++)
            {
                System.out.print(grid[i][j]+" ");
            }
        }
        
    }
}
