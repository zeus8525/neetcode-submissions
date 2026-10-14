class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                boolean res = dfs(board,word,i,j,0);
                if(res) return true;
            }
        }
        return false;
    }

    public boolean dfs(char[][] board, String word, int i, int j, int pos){
        if(i<0 || j <0 || i >= board.length || j>=board[0].length){
            return false;
        }
        
        if(board[i][j]!=word.charAt(pos)){
            return false;
        }
        if(pos == word.length()-1){
            return true;
        }

        char temp = board[i][j];
        board[i][j] = '#';

        int x[]=new int[]{1,0,-1,0};
        int y[]=new int[]{0,1,0,-1};

        for(int m = 0;m<x.length;m++){
            boolean res = dfs(board,word,i+x[m],j+y[m],pos+1);
            if(res) {
                board[i][j] = temp;
                return true;
            }
        }
        board[i][j] = temp;
        return false;
    }
}