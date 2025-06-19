class Solution {
    public int maxAscendingSum(int[] nums) {
        int Sum = nums[0];
        int Max = nums[0];
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            if (nums[i] > nums[i - 1]) {
                Sum += nums[i];
            } else {
                Max = Math.max(Sum,Max);
                Sum=nums[i];
            }
        }
        if (Max > Sum) {
            return Max;
        }
        return Sum;
    }
}
