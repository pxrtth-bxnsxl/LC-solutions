class Solution {
    public int robbed(int[] nums,int idx,int[] dp){
        if(idx<0) return 0;
        if(idx==0) return nums[idx];
        if(idx==1) return Math.max(nums[idx-1],nums[idx]);
        if(dp[idx]!=-1) return dp[idx]; 
        return dp[idx] = nums[idx] + Math.max(robbed(nums,idx-2,dp),robbed(nums,idx-3,dp));
        
    }
    public int rob(int[] nums) {
        int n = nums.length;
        int dp[] = new int[n];
        Arrays.fill(dp,-1);
        return Math.max(robbed(nums,n-1,dp),robbed(nums,n-2,dp));
    }
}