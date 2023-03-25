class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0; 
        int n = mat.length;
        
        for(int i = 0; i < n; i++){
            sum += mat[i][i];
        }
        
        for(int i = 0, j = n - 1; i < n && j >= 0; i++, j--){
            if(i != j){
            sum+= mat[i][j];
            }
        }
        return sum;
    }
}
