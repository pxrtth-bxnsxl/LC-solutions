class Solution {
    public int countSquares(int[][] matrix) {
        int count = 0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i==0||j==0) count+=matrix[i][j];
                else {
                    if(matrix[i][j]==0) continue;
                    else{
                        int a = Math.min(matrix[i][j-1],matrix[i-1][j-1]);
                        int b = Math.min(matrix[i][j-1],matrix[i-1][j]);
                        matrix[i][j] += Math.min(a,b);
                        count+=matrix[i][j];
                    }
                }
            }
        }
        return count;
    }
}