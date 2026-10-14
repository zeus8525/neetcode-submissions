class Solution {
    public boolean isValidSudoku(char[][] board) {
        int row[][] = new int[10][10];
        int col[][] = new int[10][10];
        int box[][] = new int[10][10];

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.') continue;
                int nxt = board[i][j]-'0';
                if(!isValid(nxt,i,j,row,col,box)){
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isValid(int m, int i, int j, int row[][], 
        int col[][],int box[][]){
        if(row[i][m]!=0){
            return false;
        }
        if(col[j][m]!=0){
            return false;
        }
        int b = 3*(i/3) + (j/3);
        if(box[b][m]!=0){
            return false;
        }
        row[i][m] = 1;
        col[j][m] = 1;
        box[b][m] = 1;
        return true;
    }
}
