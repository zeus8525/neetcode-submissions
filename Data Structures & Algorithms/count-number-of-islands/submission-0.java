class Solution {
    public int numIslands(char[][] grid) {
        int cnt = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    dfs(grid, i, j);
                    cnt++;
                }                    
            }
        }
        return cnt;
    }

    private void dfs(char[][] grid, int i, int j){
        if(i<0 || j< 0|| i>=grid.length||j>=grid[0].length){
            return;
        }
        if(grid[i][j]=='0'){
            return;
        }
        grid[i][j] = '0';
        int x[] = new int[]{1,0,-1,0};
        int y[] = new int[]{0,1,0,-1};
        for(int m=0;m<x.length;m++){
            dfs(grid, i+x[m],j+y[m]);
        }
    }
}
