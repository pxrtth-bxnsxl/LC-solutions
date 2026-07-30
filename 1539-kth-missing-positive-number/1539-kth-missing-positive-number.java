class Solution {
    public int findKthPositive(int[] arr, int k) {
        int st = 0;
        int ed = arr.length-1;
        while(st<=ed){
            int mid = st+(ed-st)/2;
            int missingCount = arr[mid]-(mid+1);
            if(missingCount<k){
                st = mid+1;
            }
            else{
                ed = mid-1;
            }
        }
        return k+ed+1;
    }
}