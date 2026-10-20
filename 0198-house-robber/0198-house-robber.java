class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int dp[] = new int[n];
        dp[0] = nums[0];
        for(int i=1;i<n;i++){
            if(i==1){
                dp[i] = nums[i];
            }
            else if(i==2){
                dp[i] = nums[i]+dp[i-2];
            }
            else{
                dp[i] = nums[i]+Math.max(dp[i-2],dp[i-3]);
            }
        }
        if(dp.length==1) return dp[0];
        return Math.max(dp[n-1],dp[n-2]);
    }
}