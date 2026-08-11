class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
           return false;
        }
        int mapS[] = new int[256];
        int mapT[] = new int[256];
        for(int i=0;i<s.length();i++){
            char maps = s.charAt(i);
            char mapt = t.charAt(i);
            if(mapS[maps] != mapT[mapt]){
                return false;
            }else{
                mapS[maps] = i+1;
                mapT[mapt] = i+1;
            }
        }
        return true;
    }
}