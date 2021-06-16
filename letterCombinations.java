class Solution {
    public List<String> letterCombinations(String digits) {
    
     String[] codes = {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        
       if(digits.length() == 0){
            ArrayList<String> base = new ArrayList<>();           
            //base.add("");
            return base;
        }

        char ch = digits.charAt(0); //2
        String ros = digits.substring(1); //3

        List<String> rres = letterCombinations(ros); 
        List<String> mres = new ArrayList<>();

        for( char chcode: codes[ch-48-2].toCharArray()){
            
            for(String rstr: rres){
               
                mres.add(chcode+rstr);
            }
            if(rres.size() == 0){            
                mres.add(chcode+"");
            }
        }
        return mres;
    }
}
