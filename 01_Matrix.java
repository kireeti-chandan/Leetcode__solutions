// https://leetcode.com/problems/01-matrix/description/
class 01_Matrix{
    class Pair{
        int i;int j;
        Pair(int i,int j){
            this.i=i;
            this.j=j;
        }
    }
    public int[][] updateMatrix(int[][] mat) {
        Queue<Pair> qu=new LinkedList<>();
        int res[][]=new int[mat.length][mat[0].length];
        for(int i=0;i<mat.length;i++){
            Arrays.fill(res[i],-1);
        }
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j] == 0){
                    res[i][j]=0;
                    Pair curr=new Pair(i,j);
                    qu.add(curr);
                }
            }
        }
        int m=mat.length;
        int n=mat[0].length;
        Pair curr;
        while(qu.isEmpty() == false){
            Pair result=qu.remove();
            int i=result.i;
            int j=result.j;
            if(checkValidPosition(i+1,j,m,n) && res[i+1][j] == -1){
                curr=new Pair(i+1,j);
                qu.add(curr);
                res[i+1][j]=res[i][j]+1;
            }
            if(checkValidPosition(i-1,j,m,n) && res[i-1][j] == -1){
                curr=new Pair(i-1,j);
                qu.add(curr);
                res[i-1][j]=res[i][j]+1;
            }
            if(checkValidPosition(i,j+1,m,n) && res[i][j+1] == -1){
                curr=new Pair(i,j+1);
                qu.add(curr);
                res[i][j+1]=res[i][j]+1;
            }
            if(checkValidPosition(i,j-1,m,n) && res[i][j-1] == -1){
                curr=new Pair(i,j-1);
                qu.add(curr);
                res[i][j-1]=res[i][j]+1;
            }


        }
        return res;
    }
    public static boolean checkValidPosition(int i,int j,int m,int n){
        if(i < 0 || j< 0|| i >=m|| j>=n)
            return false;
        return true;
    }
}
