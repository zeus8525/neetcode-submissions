class Solution {
    public void solve(char[][] board) {
        boolean [][]noChange = new boolean[board.length][board[0].length];

        int ROW = board.length-1;
        int COL = board[0].length-1;
        for(int i=0;i<board.length;i++){            
            if(board[i][0]=='O'){
                dfs(i,0,board,noChange);
            }
            if(board[i][COL]=='O'){
                dfs(i,COL,board,noChange);
            }            
        }

        for(int i=1;i<COL;i++){            
            if(board[0][i]=='O'){
                dfs(0,i,board,noChange);
            }
            if(board[ROW][i]=='O'){
                dfs(ROW,i,board,noChange);
            }            
        }

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='O' && !noChange[i][j]){
                    board[i][j] = 'X';
                }
            }
        }
    }

    public void dfs(int i, int j, char[][] board, boolean [][]noChange){
        if(i<0||j<0||i>=board.length||j>=board[0].length) return;
        if(noChange[i][j]) return;
        if(board[i][j]=='X') return;
        noChange[i][j] = true;
        int directions[][] = new int[][]{{1,0},{0,1},{-1,0},{0,-1}};
        for(int m=0;m<directions.length;m++){
            dfs(i+directions[m][0],j+directions[m][1],board,noChange);
        }
    }
}
