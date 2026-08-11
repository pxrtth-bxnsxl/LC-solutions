class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> mp = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ss = s.charAt(i);
            char tt = t.charAt(i);
            if(mp.containsKey(ss)){
                if(mp.get(ss)!=tt){
                    return false;
                }
            }
            else{
                if(mp.containsValue(tt)){
                    return false;
                }
            }
            mp.put(ss,tt);
        }
        return true;
    }
}