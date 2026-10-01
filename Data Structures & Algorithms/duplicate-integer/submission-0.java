class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> output = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(output.contains(nums[i])){
                return true;
            }
            else{
                output.add(nums[i]);
            }
        }
        return false;
    }
}