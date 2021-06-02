class Solution {
    public int largestAltitude(int[] gain) {
        int alt = 0;
        int max = 0;
        for(int i = 0; i<gain.length;i++){
            alt = alt + gain[i];
            if(max<alt){
                max = alt;
            }
        }
        return max;
    }
}
