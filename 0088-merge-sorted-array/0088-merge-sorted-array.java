class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int pointer=0;
        for(int i=m;i<m+n;i++){
            nums1[i] = nums2[pointer++];
        }
        Arrays.sort(nums1);
    }
}