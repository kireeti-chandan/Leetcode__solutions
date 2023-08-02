//https://practice.geeksforgeeks.org/problems/shortest-source-to-destination-path3544/1
class Tuple{
    int distance;
    int row;
    int column;
    Tuple(int distance,int row,int column){
        this.distance=distance;
        this.row=row;
        this.column=column;
    }
}
class Shortest_Source_to_Destination_Path {
    int shortestDistance(int N, int M, int A[][], int X, int Y) {
        // code here
        if(X == 0 && Y==0)
            return 0;
        Queue<Tuple> q=new LinkedList<>();
        q.add(new Tuple(0,0,0)); //source node
        int arr[][]=new int[N][M]; // To store Distances from source to arr[i][j]
        for(int i=0;i<N;i++){
             Arrays.fill(arr[i],Integer.MAX_VALUE);
        }
        arr[0][0]=0;
        int rr[]={-1,0,1,0};
        int cc[]={0,1,0,-1}; 
        while(q.isEmpty() == false){
            Tuple curr=q.remove();
            int distance=curr.distance;
            int r=curr.row;
            int c=curr.column;
            for(int i=0;i<4;i++){
                int newrow=r+rr[i];
                int newcol=c+cc[i];
                if( newrow >= 0 && newrow <N && newcol >=0 && newcol <M && A[newrow][newcol]== 1 && distance+1 < arr[newrow][newcol]){
                    A[newrow][newcol]=distance+1;
                    if(newrow ==X && newcol == Y)
                        return A[newrow][newcol];
                    q.add(new Tuple(distance+1,newrow,newcol));
                }
            }
        }
        return -1;
        
    }
}
