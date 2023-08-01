//https://practice.geeksforgeeks.org/problems/depth-first-traversal-for-a-graph/1

class DFS_Of_Graph {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean visited[]=new boolean[V];
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<V;i++){
            if(visited[i]==false){
                dfs(adj,i,visited,arr);
            }
        }
        return arr;
    }
    public static void dfs(ArrayList<ArrayList<Integer>> adj,int s,boolean[] visited,ArrayList<Integer> arr){
        arr.add(s);
        visited[s]=true;
        for(int u:adj.get(s)){
            if(visited[u] == false){
                dfs(adj,u,visited,arr);
            }
        }
    }
}
