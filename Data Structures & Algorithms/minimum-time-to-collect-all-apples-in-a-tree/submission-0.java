class Solution {
    public static int dfs( List<List<Integer>> adjList,int curr,int parent,List<Boolean> hasApple){
        int time=0;
        for(int child:adjList.get(curr)){
            if(child==parent)continue;
            int time_child=dfs(adjList,child,curr,hasApple);
            if(time_child>0||hasApple.get(child)){
                time+=time_child+2;
            }
        }
return time;
    }
    public int minTime(int n, int[][] edges, List<Boolean> hasApple) {
        List<List<Integer>> adjList=new ArrayList<>();
        for(int i=0;i<n;i++){
adjList.add(new ArrayList<>());
        }
        for(int[]edge:edges){
            adjList.get(edge[0]).add(edge[1]);
            adjList.get(edge[1]).add(edge[0]);
        }
        return dfs(adjList,0,-1,hasApple);
    }
}