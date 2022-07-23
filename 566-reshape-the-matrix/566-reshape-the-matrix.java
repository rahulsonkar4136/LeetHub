class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int row = mat.length;
        int col = mat[0].length;
        int n = row*col;
        int new_col = n/r;
        if(new_col!=c)
            return mat;
        int ans[][] = new int[r][c];
        int k=0, w = 0;
        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                ans[k][w++] = mat[i][j];
                if(w==c){
                    k++;
                    w=0;
                }
            }
        }
        return ans;
        
    }
}