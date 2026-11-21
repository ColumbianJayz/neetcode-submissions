class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<int[]> stack = new ArrayDeque<>();
        int[] results = new int[temperatures.length];

        for(int i = 0; i < temperatures.length; i++){
            int current = temperatures[i];

            while(!stack.isEmpty() && current > stack.peek()[0]){
                results[stack.peek()[1]] = i - stack.peek()[1];
                stack.pop();
            
            }
            stack.push(new int[]{current, i});
        }
        return results;

        
    }
}
