class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Deque<int[]> stack = new ArrayDeque<>();

        for(int i = 0; i < temperatures.length; i++){
            int current = temperatures[i];
            while(!stack.isEmpty() && current > stack.peek()[0]){
                int[] waitingPair = stack.pop();
                result[waitingPair[1]] = i - waitingPair[1];
            }
            stack.push(new int[]{current, i});
        }
        return result;

        
    }
}
