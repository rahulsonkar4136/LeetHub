class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] != '.' && check(board, i, j, board[i][j])) return false;
            }
        }
        return true;
    }
    
    public boolean check(char[][] b, int r, int c, char v){
        for(int i = 0; i < b[0].length; i++){
            if(v == b[r][i] && i != c) return true;
        }
        
        for(int j = 0; j < b.length; j++){
            if(v == b[j][c] && j != r) return true;
        }
        
        for(int i = r / 3 * 3; i < r / 3 * 3 + 3; i++){
            for(int j = c / 3 * 3; j < c / 3 * 3 + 3; j++){
                if(v == b[i][j] && (i != r && j != c)) return true;
            }
        }
        return false;
        
    }
}