class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length==1){
            return 0;
        }
        if(nums[0]>nums[1]){
            return 0;
        }
        if(nums[nums.length-1]>nums[nums.length-2]){
            return nums.length-1;
        }
        int st = 1;
        int ed = nums.length-2;
        while(st<=ed){
            int mid = st+(ed-st)/2;
            if(nums[mid]>=nums[mid-1]&&nums[mid+1]<=nums[mid]){
                 return mid;
                }
            else if(nums[mid]<nums[mid+1]){
                st = mid+1;
            }
            else{
                ed =mid-1;
              }
        }
        return -1;
    }
}