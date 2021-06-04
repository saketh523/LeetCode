class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        
        int valueA = 0, valueB = 0, valueC = 0;


        for (int i = 0; i < firstWord.length(); i++) {
            valueA = valueA*10 + firstWord.charAt(i)-97;
        }
        for (int i = 0; i < secondWord.length(); i++) {
            valueB = valueB*10 + secondWord.charAt(i)-97;
        }
        for (int i = 0; i < targetWord.length(); i++) {
            valueC = valueC*10 + targetWord.charAt(i)-97;
        }
        if(valueA + valueB == valueC){
            return true;
        }
        else{
            return false;
        }
        
    }
}
