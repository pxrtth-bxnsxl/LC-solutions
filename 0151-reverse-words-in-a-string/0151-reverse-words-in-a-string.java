class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            while(i>=0&&s.charAt(i)==' '){
                i--;
            }
            if(i<0){
                break;
            }
            int right = i;
            while(i>=0&&s.charAt(i)!=' '){
                i--;
            }
            if(sb.length()>0){
                sb.append(' ');
            }
            sb.append(s.substring(i+1,right+1));
        }
        return sb.toString();
    }
}