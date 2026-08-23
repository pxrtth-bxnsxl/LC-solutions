class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char s1[] = new char[s.length()];
        char s2[] = new char[t.length()];
        for(int i=0;i<s.length();i++){
            s1[i] = s.charAt(i);
            s2[i] = t.charAt(i);
        }
        Arrays.sort(s1);
        Arrays.sort(s2);
        for(int i=0;i<s1.length;i++){
            if(s1[i]!=s2[i]){
                return false;
            }
        }
        return true;
    }
}