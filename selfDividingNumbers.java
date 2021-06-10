class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        
        List<Integer> list=new ArrayList<Integer>();
        
        int n = 0, temp = 0, count = 0, value=0;
        for( int inp = left; inp<=right; inp++){
            n = inp;
            count = 0;
            value = 0;
            while(n>0){
                temp = n%10;
                count++;
                if(temp!=0){
                    if(inp%temp == 0){
                        value++;
                    }
                }
                n = n/10;
            }
            if(count == value){
                list.add(inp);
            }

        }
       return list; 
    }
}
