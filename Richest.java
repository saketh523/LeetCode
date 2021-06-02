class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int m = accounts.length;
        int n = accounts[0].length;
        int i = 0;
        int j = 0;
        int maxWealth = 0;
        int richest = 0;
        
        for(; i<m;i++){
            maxWealth = 0;
            j = 0;
            for(; j<n;j++){
                
                maxWealth = maxWealth + accounts[i][j];
            }
            
            if(richest < maxWealth)
               richest = maxWealth;
        }
        
        return richest;
        
    }
}
