class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<nums.length-3;i++){
            for(int j=i+1;j<nums.length-2;j++){
                int k = j+1;
                int m = nums.length-1;
                if(i>0&&nums[i]==nums[i-1]){
                    continue;
                }
                if(j>i+1&&nums[j]==nums[j-1]){
                    continue;
                }
                while(k<m){
                    long sum = (long)nums[i]+nums[j]+nums[k]+nums[m];
                    if(sum==target){
                        list.add(Arrays.asList(nums[i],nums[j],nums[k],nums[m]));
                        k++;
                        m--;
                        while(k<m&&nums[k]==nums[k-1]){
                            k++;
                        }
                        while(k<m&&nums[m]==nums[m+1]){
                            m--;
                        }
                    }
                    else if(sum<target){
                        k++;
                    }
                    else {
                        m--;
                    }

                }
            }
        }
        return list;
    }
}