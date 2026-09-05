class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int suffix[] = new int[n];
        suffix[n-1] = nums[n-1];
        for(int i=n-2;i>=0;i--){
            suffix[i] = Math.min(suffix[i+1],nums[i]);
        }
        int curr = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            curr = Math.max(curr,nums[i]);
            if(curr-suffix[i]<=k){
                return i;
            }
        }
        return -1;
    }
}