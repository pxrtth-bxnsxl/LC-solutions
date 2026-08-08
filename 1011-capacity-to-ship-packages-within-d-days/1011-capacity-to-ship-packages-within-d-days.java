class Solution {
    private boolean leastCapacity(int[] weights,int d,int currCapacity){
        int days = 1;
        int load = 0;
        for(int i=0;i<weights.length;i++){
            if(load+weights[i]>currCapacity){
                days++;
                load = weights[i];
            }
            else{
                load+=weights[i];
            }
        }
        return days<=d;
    }
    public int shipWithinDays(int[] weights, int days) {
        int st = 0;
        int ed = 0;
        for(int num : weights){
            st = Math.max(num,st);
            ed +=num;
        }
        int capacity = -1;
        while(st<=ed){
            int mid = st+(ed-st)/2;
            if(leastCapacity(weights,days,mid)){
                capacity = mid;
                ed = mid-1;
            }
            else{
                st = mid+1;
            }
        }
        return capacity;
    }
}