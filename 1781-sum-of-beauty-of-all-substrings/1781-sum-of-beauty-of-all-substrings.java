class Solution {
    public int getMax(int arr[]){
        int maxi=0;
        for(int i=0;i<arr.length;i++){
            maxi = Math.max(maxi,arr[i]);
        }
        return maxi;
    }
    public int beautySum(String s) {
        int sum = 0;
        for(int i=0;i<s.length();i++){
            int freq[] = new int[26];
            for(int j=i;j<s.length();j++){
                freq[s.charAt(j)-'a']++;
                sum+= getMax(freq)-getMin(freq);
            }
        }
        return sum;
    }
    public int getMin(int arr[]){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                min = Math.min(min,arr[i]);
            }
        }
        return min;
    }
}