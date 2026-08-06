class Solution {
    public int smallestNumber(int n, int t) {
        int multi = 1;
        int og = n;
        while(n>0){
            multi = n%10*multi;
            n=n/10;
        }
        if(multi%t==0){
            return og;
        }
        else{
            return smallestNumber(og+1,t);
        }
    }
}