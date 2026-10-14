class Solution {
    int currMax = 0;
    public int maxAreaOfIsland(int[][] grid) {
        int res = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    currMax = 0;
                    dfs(grid, i, j);
                    res = Math.max(res, currMax);
                }                    
            }
        }
        return res;
    }

    private void dfs(int[][] grid, int i, int j){
        if(i<0 || j< 0|| i>=grid.length||j>=grid[0].length){
            return;
        }
        if(grid[i][j]==0){
            return;
        }
        currMax ++;
        grid[i][j] = 0;
        int x[] = new int[]{1,0,-1,0};
        int y[] = new int[]{0,1,0,-1};
        for(int m=0;m<x.length;m++){
            dfs(grid, i+x[m],j+y[m]);
        }
    }
}
