class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        int maxKid = 0;
        
        List<Boolean> abcd = new ArrayList<>();
        
        for(int i =0;i<candies.length;i++){
            if(maxKid < candies[i]){
                maxKid = candies[i];
            }
        }
        
        // maxKid has the max value of candies currently.
        
        for(int j=0;j<candies.length;j++){
            if(candies[j] <= maxKid){
                candies[j] = candies[j] + extraCandies; 
                    if(candies[j] < maxKid){
                    abcd.add(false);
                    }
                    else{
                    abcd.add(true);
                    }
            }
        }
        
        return abcd;
    }
}
