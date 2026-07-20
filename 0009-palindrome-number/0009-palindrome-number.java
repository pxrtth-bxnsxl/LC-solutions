class Solution {
    public boolean isPalindrome(int x) {
        int og = x;
        int ans = 0;
        if(x<0){
            return false;
        }
        while(x!=0){
            int digit = x%10;
            ans = digit+ans*10;
            x=x/10;
        }
        return og==ans;
        
    }
}