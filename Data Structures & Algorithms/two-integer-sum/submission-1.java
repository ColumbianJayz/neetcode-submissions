class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> tracker = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int theNum = target - nums[i];
            if(tracker.containsKey(theNum)){
                return new int[]{tracker.get(theNum), i};
            }
            tracker.put(nums[i], i);
        }
        return new int[]{};

    }
}
