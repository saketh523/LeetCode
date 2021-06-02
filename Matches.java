class Solution {
    public int numberOfMatches(int n) {       
        
        /*
            n = even
                n/2 matches played and n/2 teams advance to next round
            n = odd
                n-1/2 matches played and (n-1)/2 + 1 advance to next round
                
            return num Of Matches played until a winner is decided
            
        */
        int matchCount = 0;
        while(n>0){
            if(n==1)
                return matchCount;
            
            matchCount += n/2;
            
            if(n%2==0)
                n = n/2;                                
            else
                n = n/2 + 1;
        }
            
        return matchCount;
    }
}
