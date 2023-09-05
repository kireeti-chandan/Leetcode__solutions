class Print_Adjacency_List {
    public List<List<Integer>> printGraph(int V, int edges[][]) {
        List<List<Integer>> ls=new ArrayList<>();
        for(int i=0;i<V;i++){
            ls.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            addEdge(ls,edges[i][0],edges[i][1]);
        }
        return ls;
    }
    public static  void addEdge(List<List<Integer>> ls,int e1,int e2){
        ls.get(e1).add(e2);
        ls.get(e2).add(e1);
    }
}
