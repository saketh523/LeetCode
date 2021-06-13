class Solution {
    public int heightChecker(int[] heights) {
        
        int count = 0;

        List<Integer> expected = new ArrayList<>();

        for(int i =0;i < heights.length;i++){
            expected.add(heights[i]);
        }

        Collections.sort(expected);

        Integer[] arr = new Integer[expected.size()];
        arr = expected.toArray(arr);


        for(int j =0; j< heights.length;j++){
            if(heights[j]!= arr[j] ){
                count++;
            }

        }
        return count;
        
    }
}
