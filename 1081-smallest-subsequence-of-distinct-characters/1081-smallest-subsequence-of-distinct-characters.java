class Solution {
    public String smallestSubsequence(String s) {
        Stack<Character> st = new Stack<>();
        int last[] = new int[26];
        boolean seen[] = new boolean[26];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            last[ch-'a']=i; 
        }
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(st.isEmpty()){
                st.push(ch);
                seen[ch-'a'] = true;
            }
            if(seen[ch-'a']){
                continue;
            }
            while(!st.isEmpty()&&ch<st.peek()&&i<last[st.peek()-'a']){
                char x = st.pop();
                seen[x-'a'] = false;
            }
            st.push(ch);
            seen[ch-'a']=true;
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}