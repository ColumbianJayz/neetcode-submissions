class Solution {
    public int maxArea(int[] heights) {
        int result = 0;
        int start = 0;
        int end = heights.length-1;

        while(start < end){
            int width = end - start;
            int height = Math.min(heights[start], heights[end]);
            int area = height * width;
            result = Math.max(result, area);

            if(heights[start] <= heights[end]){
                start++;
            }else{
                end--;
            }
        }
        return result;
    }
}
