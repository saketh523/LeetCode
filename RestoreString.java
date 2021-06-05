class Solution {
    public String restoreString(String s, int[] indices) {
        
        char[] arr1 = new char[s.length()];
        arr1 = s.toCharArray();

        char[] arr2 = new char[indices.length];

        for(int i =0; i<s.length();i++){
            arr2[indices[i]] = arr1[i];
        }
        
        return String.valueOf(arr2);
    }
}
