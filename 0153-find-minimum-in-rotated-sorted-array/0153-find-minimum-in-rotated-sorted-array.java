class Solution {
    public int findMin(int[] nums) {
        int min = nums[0];
        int st = 0;
        int ed = nums.length-1;
        while(st<=ed){
            int mid = st+(ed-st)/2;
            if(min>nums[mid]){
                min = nums[mid];
            }
            else if(nums[mid]>=nums[st]&&min<=nums[st]){
                st = mid+1;
            }
            else{
                ed = mid-1;
            }

        }
        return min;
    }
}