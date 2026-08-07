class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if(bloomDay.length<(m*k)){
            return -1;
        }
        int st = 1;
        int ed = 0;
        for(int num:bloomDay){
            ed = Math.max(num,ed);
        }
        int minDays = -1;
        while(st<=ed){
            int mid = st+(ed-st)/2;
            if(canMakeBouquets(bloomDay,m,k,mid)){
                minDays = mid;
                ed = mid-1;
            }
            else{
                st = mid+1;
            }
        }
        return minDays;
    }


    private Boolean canMakeBouquets(int[] bloomDay,int m,int k,int currentDay){
        int bouquet = 0;
        int flowers = 0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=currentDay){
                flowers++;
                if(flowers==k){
                    bouquet++;
                    flowers=0;
                }
            }
            else{
                flowers=0;
            }
            if(bouquet>=m){
                return true;
            }
        }
        return false;
    }
}