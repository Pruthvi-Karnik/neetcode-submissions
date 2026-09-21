class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map <Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            if(map.containsValue(nums[i])==false)
                map.put(i,nums[i]);
            else
            return true;
        }
        return false;
    }
}