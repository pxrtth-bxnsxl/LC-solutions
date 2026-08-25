class Solution {
    public int candy(int[] ratings) {
        int start[] = new int[ratings.length];
        Arrays.fill(start,1);
        for(int i=1;i<ratings.length;i++){
            if(ratings[i-1]<ratings[i]){
                start[i] = start[i-1]+1;  
            }
        }
        for(int i=ratings.length-2;i>=0;i--){
            if(ratings[i]>ratings[i+1]){
                start[i] = Math.max(start[i],start[i+1]+1);
            }
        }
        int sum = 0;
        for(int i=0;i<start.length;i++){
            sum+=start[i];
        }
        return sum;
        
    }
}