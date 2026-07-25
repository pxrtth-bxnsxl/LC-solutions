class Solution {
    public int[] searchRange(int[] nums, int target) {
        int st = 0;
        int first = -1;
        int last = -1;
        int ed = nums.length-1;
        while(st<=ed){
            int mid = st+(ed-st)/2;
            if(nums[mid]==target){
                first = mid;
                ed = mid-1;
            }
            else if(nums[mid]>target){
                ed = mid-1;
            }
            else{
                st = mid+1;
            }
        }
        st = 0;
        ed = nums.length-1;
        while(st<=ed){
            int mid = st+(ed-st)/2;
            if(nums[mid]==target){
                last = mid;
                st = mid+1;
            }
            else if(nums[mid]>target){
                ed = mid-1;
            }
            else{
                st = mid+1;
            }
        }
        return new int[]{first,last};
        
    }
}