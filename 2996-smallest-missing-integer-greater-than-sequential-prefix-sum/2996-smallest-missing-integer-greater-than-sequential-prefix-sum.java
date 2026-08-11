class Solution {
   
    public int missingInteger(int[] nums) {
        int sum = nums[0];
        int maxSum = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]+1){
                sum+=nums[i];
            }
            else{
                break;
            }
            // else{
            //     maxSum = Math.max(sum,maxSum);
            //     sum = nums[0];
            // }
        }
        maxSum = sum;
        Arrays.sort(nums);
        if(maxSum>nums[nums.length-1]){
            return maxSum;
        }
        int j = maxSum;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==j){
                j++;
            }
        }
        return j;
    }
}