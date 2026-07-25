class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int st = 0;
        int ed = nums.length-1;
        
        while(st<=ed){
            int mid = st+(ed-st)/2;
            if(mid==0 && nums[mid]!=nums[mid+1]){
                return nums[mid];
            }
            else if(mid==nums.length-1 && nums[mid]!=nums[mid-1]){
                return nums[mid];
            }
            else{
                if(nums[mid]!=nums[mid+1]&&nums[mid]!=nums[mid-1]){
                    return nums[mid];
                }
                else if(mid%2==0){
                    if(nums[mid]==nums[mid-1]){
                        ed = mid-1;
                    }
                    else{
                        st = mid+1;
                    }
                }
                else{
                    if(mid%2!=0){
                        if(nums[mid]==nums[mid-1]){
                            st = mid+1;
                        }
                        else{
                            ed = mid-1;
                        }
                    }
                }
            }
        }
        return -1;
    }
}