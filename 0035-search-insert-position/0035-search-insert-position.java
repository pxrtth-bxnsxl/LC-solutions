class Solution {
    public int searchInsert(int[] nums, int target) {
        int st = 0;
        int ed = nums.length-1;
        while(st<=ed){
            int modi = st+(ed-st)/2;
            if(nums[modi]==target){
                return modi;
            }
            else if(nums[modi]<target){
                st = modi+1;
            }
            else{
                ed = modi-1;
            }
        }
        return st;
    }
}