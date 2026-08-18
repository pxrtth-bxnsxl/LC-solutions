class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        int[] count = new int[51];
        for (int num : nums) {
            count[num]++;
        }
        if (k == n) {
            int maxVal = -1;
            for (int num : nums) {
                maxVal = Math.max(maxVal, num);
            }
            return maxVal;
        }
        if (k == 1) {
            int maxUnique = -1;
            for (int num : nums) {
                if (count[num] == 1) {
                    maxUnique = Math.max(maxUnique, num);
                }
            }
            return maxUnique;
        }
        int res = -1;
        if (count[nums[0]] == 1) {
            res = Math.max(res, nums[0]);
        }
        if (count[nums[n - 1]] == 1) {
            res = Math.max(res, nums[n - 1]);
        }
        
        return res;
    }
}