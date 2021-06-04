class Solution {
    public int balancedStringSplit(String s) {
        
        /*
            
            s = "RLRRLLRLRL"
            
            R
            RL - 1
            RLRR
            RLRRL 
            RLRRLL - 1
            RLRRLLR
            RLRRLLRL - 1
            RLRRLLRLR
            RLRRLLRLRL -1 
            
            
            s= RLRRRLLRLL
            
            R
            RL - 1
            RLR
            RLRR
            RLRRR
            RLRRRL
            RLRRRLL - 1
            RLRRRLLR
            RLRRRLLRL
            RLRRRLLRLL 
            
        */
        
        int countR = 0;
        int countL = 0;
        int res = 0;
        for(int i=0; i<s.length();i++){
            
            if(s.charAt(i) == 'R'){
                countR++;
            }
            else{
                countL++;
            }
            if(countR == countL){
                
                res++;
            }
        }
        return res;
            
        
    }
}
