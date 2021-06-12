class Solution {
    public int sumOfUnique(int[] nums) {
        
       int res = 0;

        List<Integer> list = new ArrayList<>();

        for(int i =0; i< nums.length;i++){
            list.add(nums[i]);
        }

        for(int i = 0; i< nums.length; i++) {
            if (Collections.frequency(list, nums[i]) == 1) {
                res = res + nums[i];
            }
        }
        return res;
        
    }
}
