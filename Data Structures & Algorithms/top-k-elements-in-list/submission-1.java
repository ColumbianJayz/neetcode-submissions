class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a,b)->a[1]-b[1]);
        for(Map.Entry<Integer, Integer> mappy : map.entrySet()){
            minHeap.offer(new int[]{mappy.getKey(), mappy.getValue()});

            if(minHeap.size() > k ){
                minHeap.poll();
            }
        }
        
        int[] result = new int[k];

        for(int i = 0; i < k; i++){
            result[i] = minHeap.poll()[0];
        }

        return result;
    }
}
