class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> root = new ArrayList<>();
            int val = 1;
            for(int j=0;j<=i;j++){
                root.add(val);
                val = val*(i-j)/(j+1);
            }
            list.add(root);
        }
        return list;
        
    }
}