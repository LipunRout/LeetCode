class Solution {
    public int maxArea(int[] height) {
        int st = 0;
        int end = height.length - 1;
        int min = 0;
        int Max = 0;

        while (st < end) {
            min = Math.min(height[st], height[end]);
            int width = end - st;
            int max = min * width;
            Max = Math.max(Max, max);

            if (height[st] < height[end]) {
                st++;
            } else {
                end--;
            }

        }
        return Max;
    }
}
