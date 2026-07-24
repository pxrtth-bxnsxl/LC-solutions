class Solution {
    public boolean search(int[] nums, int target) {
        int st = 0;
        int ed = nums.length-1;
        while(st<=ed){
            int mid = st+(ed-st)/2;
            if(nums[mid]==target){
                return true;
            }
            else if(nums[mid]==nums[st]&&nums[mid]==nums[ed]){
                st++;
                ed--;
            }
            else if(nums[mid]>=nums[st]){
                if(nums[st]<=target&&nums[mid]>=target){
                    ed = mid-1;
                }
                else{
                    st = mid+1;
                }
            }
            else{
                if(nums[mid]<=target&&nums[ed]>=target){
                    st = mid+1;
                }
                else{
                    ed = mid-1;
                }
            }
        }
        return false;
        
    }
}