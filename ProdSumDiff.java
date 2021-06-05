class Solution {
    public int subtractProductAndSum(int n) {
        
        int temp = 0, prodVal = 1, sum = 0;
        
        while(n>0){
            temp = n%10;
            
            prodVal = prodVal*temp;
            sum = sum + temp;
            
            n = n/10;
        }
        return prodVal-sum;
    }
}
