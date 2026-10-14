class Solution {
    short [][]col = new short[10][10];
    short [][]row = new short[10][10];
    short [][]box = new short[10][10];

    public boolean isValidSudoku(char[][] board) {
        
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.')continue;
                if(!isValid(i,j,board)){
                    return false;
                }
                col[j][board[i][j]-'0']=1;
                row[i][board[i][j]-'0']=1;
                int bx = (j/3)+3*(i/3);
                box[bx][board[i][j]-'0'] = 1;
            }
        }
        return true;
    }

    public boolean isValid(int i, int j, char[][]board){
        if(col[j][board[i][j]-'0']==1) return false;
        if(row[i][board[i][j]-'0']==1) return false;
        int bx = (j/3)+3*(i/3);
        if(box[bx][board[i][j]-'0'] == 1) return false;
        return true;
    }
}
