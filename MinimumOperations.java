class Solution {
    public int[] minOperations(String boxes) {
        
        int n = boxes.length();
        int[] res = new int[n];
        int count = 0;
        int i = 0;
        int j = 0;
        for(; i<n; i++){
            count = 0;
            j = 0;
            for(; j<n;j++){
                if(boxes.charAt(j) != '0' && i!=j){
                    count = count + Math.abs(i-j);
                }
            }
            res[i] = count;
        }
        return res;
    }
}
