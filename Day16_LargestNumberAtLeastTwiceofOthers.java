class Solution {
    public int dominantIndex(int[] nums) {
        int max = -1;
        int smax = -1;
        int Idx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                smax = max;
                max = nums[i];
                Idx = i;
            } else if (smax < nums[i] && smax != max) {
                smax = nums[i];
            }
        }
        if (smax * 2 <= max) {
            return Idx;
        } else {
            return -1;
        }
    }
}
