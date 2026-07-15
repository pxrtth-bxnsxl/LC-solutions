class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int idx = -1;
        
        // 1. Find the first decreasing element from the end
        for(int i = n - 2; i >= 0; i--) {
            if(nums[i] < nums[i + 1]) {
                idx = i;
                break;
            }
        }
        
        // 2. If we found a valid dip, find the next largest element and swap
        if(idx >= 0) {
            for(int i = n - 1; i > idx; i--) {
                if(nums[i] > nums[idx]) {
                    int temp = nums[i];
                    nums[i] = nums[idx];
                    nums[idx] = temp;
                    break;
                }
            }
        }
        
        // 3. Reverse the suffix (or the whole array if idx == -1)
        int left = idx + 1;
        int right = n - 1;
        while(left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}