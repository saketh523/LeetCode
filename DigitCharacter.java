class Solution {
    public String replaceDigits(String s) {

        int num = 0, prev =0, temp = 0;
        char c = 'a';
        
        char[] arr1 = s.toCharArray();
        char[] arr2 = new char[s.length()];
        arr2[0] = arr1[0];
        
        for(int i=1; i<s.length();i++){
            if(i%2 != 0){
                arr2[i] = (char)(arr1[i] - '0'+ arr1[i-1]);
            }
            else{
                arr2[i] = arr1[i];
            }
        }
        return String.valueOf(arr2);
    }
}
