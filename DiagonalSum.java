class Solution {
    public int diagonalSum(int[][] mat) {
        int primary = 0, secondary = 0;
        for(int i=0; i< mat.length;i++){
            for(int j=0; j<mat[0].length;j++){

                if(i==j){
                    primary = primary+ mat[i][j];
                    
                }
                // i = n-j-1 // 3-0-1 = 2 // 3-1-1 = 1 // 3-2-1 =0
                else if(i==mat[0].length-j-1){
                    secondary = secondary + mat[i][j];
                    
                }

            }
        }
        return (primary+secondary);
    }
}
