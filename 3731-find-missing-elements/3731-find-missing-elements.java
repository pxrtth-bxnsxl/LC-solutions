class Solution {
    public List<Integer> findMissingElements(int[] arr) {
        List<Integer> list = new ArrayList<>();
        if (arr == null || arr.length <= 1) {
            return list;
        }

        Arrays.sort(arr);
        
        int j = arr[0] + 1; 
        int i = 1; 
        
        while (i < arr.length) {
            if (arr[i] == j) {
                j++;
                i++;
            } else if (arr[i] > j) {
                list.add(j);
                j++;
            } else {
                i++;
            }
        }
        
        return list;
    }
}