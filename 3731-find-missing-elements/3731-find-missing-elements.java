class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min = Integer.MAX_VALUE;
         int max = 0;
         boolean missing[] = new boolean[101];
         for(int num : nums){
           min = Math.min(min,num);
           max = Math.max(max,num);
           missing[num] = true;
         }
         List<Integer>list = new ArrayList<>();
         for(int i=min;i<max;i++){
         if(!missing[i]){
            list.add(i);
         }
         }
         return list;
    }
}