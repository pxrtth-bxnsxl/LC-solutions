class Solution {
    private boolean isEqual(int[] nums,int threshold , int k){
        int totalsum = 0;
        for(int num:nums){
            totalsum += (num-1)/k+1;
        }
        return totalsum<= threshold;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int st = 1;
        int ed = 0;
        int ans = 1;
        for(int num:nums){
            ed = Math.max(num,ed);
        }
        while(st<=ed){
            int mid = st+(ed-st)/2;
            if(isEqual(nums,threshold,mid)){
                ans = mid;
                ed = mid-1;
            }
            else {
                st = mid+1;
            }
        }
        return ans;
    }
}