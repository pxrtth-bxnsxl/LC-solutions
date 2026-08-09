class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int st = 0;
        int ed = mat[0].length-1;
        while(st<=ed){
            int mid = st+(ed-st)/2;
            int maxRow = 0;
            for(int i=0;i<mat.length;i++){
                if(mat[i][mid]>mat[maxRow][mid]){
                    maxRow = i;
                }
            }
            int left = (mid-1>=0)? mat[maxRow][mid-1]:-1;
            int right = (mid+1<mat[0].length)? mat[maxRow][mid+1]:-1;
            if(mat[maxRow][mid]>left&&mat[maxRow][mid]>right){
                return new int[]{maxRow,mid};
            }
            else if(left>mat[maxRow][mid]){
                ed =mid-1;
            }
            else{
                st = mid+1;
            }
        }
        return new int[]{-1,-1};
    }
}