class Solution {
    public void rotated(int[] nums,int st,int ed){
        while(st<=ed){
            int temp = nums[st];
            nums[st] = nums[ed];
            nums[ed] = temp;
            st++;
            ed--;
        }
    }
    public void rotate(int[] nums, int k) {
        
        int n = nums.length;
        k = k%n;
        int n1 = n-k;

        rotated(nums,0,n-k-1);
        rotated(nums,n-k,n-1);
        rotated(nums,0,n-1);
        
        
    }
}