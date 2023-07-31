class BFS_Of_Graph {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> arr=new ArrayList<>();
        Queue<Integer> que=new LinkedList<>();
        boolean visited[]=new boolean[V];
        visited[0]=true;
        arr.add(0);
        que.add(0);
        while(que.isEmpty() == false){
            int u =que.poll();
            for(int v : adj.get(u)){
                if(visited[v] == false){
                   visited[v] = true;
                   que.add(v);
                   arr.add(v);
                }
            }
        }
        return arr;
    }
}
