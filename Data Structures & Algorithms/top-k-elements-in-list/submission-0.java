class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //We need a count of numbers that appear more than one
        //Maybe a hashmap. To keep track of what we've seen. 
        //If in the hasmap already then we wan to add it to the array. or do we
        //return once we've found the k elements that are most frequent
        //Which means we also need to check which numbers have the greatest amount of appearances.
        Map<Integer, Integer> map = new HashMap<>();

        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> a[1]- b[1]);

        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            heap.offer(new int[]{entry.getKey(), entry.getValue()});
            if(heap.size() > k){
                heap.poll();
            }
        }
        int[] result = new int[k];
        for(int i = 0; i < k; i++){
            result[i] = heap.poll()[0];
        }
        return result;
    }
}
