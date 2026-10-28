class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int l = 0;
        int count = 0;
        int sum = 0;
        int targetSum = k*threshold;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        if(sum>=targetSum){
            count++;
        }
        while(k<arr.length){
            sum +=arr[k]-arr[l];
            k++;
            l++;   
             if(sum>=targetSum){
                count++;
            }
        }
        return count;
    }
}