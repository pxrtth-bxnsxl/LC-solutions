class Solution {
    private boolean eating(int[] piles,int h, int k){
        long totalhours = 0;
        for(int pile : piles){
            totalhours += (pile-1)/k+1; 
        }
        return totalhours <= h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int st = 1;
        int ed = 0;
        for(int pile : piles){
           ed = Math.max(ed,pile);
        }
        int bestSpeed = ed;
        while(st<=ed){
            int mid = st+(ed-st)/2;
            if(eating(piles,h,mid)){
                bestSpeed = mid;
                ed = mid-1;
            }
            else{
                st = mid+1;
            }
        }
        return bestSpeed;
        
    }
}