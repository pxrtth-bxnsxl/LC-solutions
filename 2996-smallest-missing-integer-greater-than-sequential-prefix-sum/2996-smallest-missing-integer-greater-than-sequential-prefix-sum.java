class Solution {
   
    public int missingInteger(int[] nums) {
        int sum = nums[0];
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
        HashSet<Integer> set = new HashSet<>();
        for(int p:nums){
            set.add(p);
        }
        
        while(set.contains(sum)){
            sum++;
        }
        return sum;
    }
}