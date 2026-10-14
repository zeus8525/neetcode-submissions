class Solution {
    int cnt = 0;
    public int countComponents(int n, int[][] edges) {
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(i,new ArrayList<>());
        }
        for(int []edge:edges){
            map.get(edge[0]).add(edge[1]);
            map.get(edge[1]).add(edge[0]);
        }
        boolean visited[] = new boolean[n];
        for(int i=0;i<n;i++){
            if(visited[i])continue;
            cnt++;
            dfs(map,i,visited);
        }
        return cnt;
    }

    private void dfs(Map<Integer, ArrayList<Integer>> map, int node,
            boolean visited[]){
        if(visited[node]) return;
        visited[node] = true;
        
        for(int i:map.get(node)){
            dfs(map,i,visited);
        } 
    }
}
