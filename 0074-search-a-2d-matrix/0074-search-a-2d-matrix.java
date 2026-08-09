class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int st = 0;
        int ed = rows*cols-1;
        while(st<=ed){
            int mid = st+(ed-st)/2;
            int midValue = matrix[mid/cols][mid%cols];
            if(midValue==target){
                return true;
            }
            else if(midValue<target){
                st = mid+1;
            }
            else{
                ed = mid-1;
            }
        }
        return false;
    }
}