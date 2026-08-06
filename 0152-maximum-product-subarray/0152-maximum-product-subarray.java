class Solution {
    public int maxProduct(int[] nums) {
        int prefixProduct = 1;
        int suffixProduct = 1;
        int max = Integer.MIN_VALUE;
        int maxS = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(prefixProduct==0){
                prefixProduct=1;
            }
            prefixProduct *=nums[i];
            if(max<=prefixProduct){
                max = prefixProduct;
            }
        }
        for(int i=nums.length-1;i>=0;i--){
            if(suffixProduct==0){
                suffixProduct=1;
            }
            suffixProduct *=nums[i];
            if(maxS<=suffixProduct){
                maxS = suffixProduct;
            }
        }
        return Math.max(max,maxS);
    }
}