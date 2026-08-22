class Solution {
    public boolean checkDivisibility(int n) {
       int sum = 0;
       int multi = 1;
       int m = n;
       int s = n;
        while(m>0){
            sum+=m%10;
            m = m/10;
        }
        while(s>0){
            multi*=s%10;
            s = s/10;
        }
        int sum2 = sum+multi;
        return n%sum2==0;
    }
}