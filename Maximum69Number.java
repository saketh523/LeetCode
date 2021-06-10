class Solution {
    public int maximum69Number (int num) {
        
        int temp = 0, count = 0;

        temp = num;
        while(temp>0){
            temp = temp/10;
            count++;
        }
        temp = num;
        System.out.println(temp);
        int[] arr = new int[count];

        for(int i =count-1; i>= 0; i--){
            arr[i] = temp%10;
            temp = temp/10;
        }
        
        int res = 0;
        boolean b = false;
        for(int i = 0; i<arr.length;i++){
            res = 10 * res + arr[i];
            if(arr[i] == 6 && b==false){

                arr[i] = 9;
                res += 3;
                b = true;
            }
        }
        return res;
         
    }
}
