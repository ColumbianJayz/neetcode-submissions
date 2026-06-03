class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int culprit = target - nums[i];
            if(map.containsKey(culprit)){
                return new int[]{map.get(culprit), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};

        
    }
}
