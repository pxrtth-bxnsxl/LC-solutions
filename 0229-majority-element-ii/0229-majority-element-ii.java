class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Integer candi1 = null;
        Integer candi2 = null;
        int count1 = 0;
        int count2 = 0;
        for(int num:nums){
            if(candi1!=null&&num==candi1){
                count1++;
            }
            else if(candi2!=null&&num==candi2){
                count2++;
            }
            else if(count1==0){
                candi1 = num;
                count1=1;
            }
            else if(count2==0){
                candi2 = num;
                count2=1;
            }
            else{
                count1--;
                count2--;
            }
        }
        List<Integer> list = new ArrayList<>();
        count1=0;
        count2=0;
        for(int num:nums){
            if(candi1!=null&&candi1==num) count1++;
            if(candi2!=null&&candi2==num) count2++;
        }
            if(count1>(nums.length/3)){
                list.add(candi1);
            }
            if(count2>(nums.length/3)){
                list.add(candi2);
            }
        
        return list;
    }
}