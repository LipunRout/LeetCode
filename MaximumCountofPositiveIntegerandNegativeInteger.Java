class Solution {
    public int lastNegative(int[] nums) {
        int st = 0;
        int end = nums.length - 1;
        int ans = -1;
        while (st <= end) {
            int mid = (st + end) / 2;
            if (nums[mid] < 0) {
                ans = mid;
                st = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    public int firstPositive(int[] nums) {
        int st = 0;
        int end = nums.length - 1;
        int ans = nums.length;
        while (st <= end) {
            int mid = (st + end) / 2;
            if (nums[mid] > 0) {
                ans = mid;
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return ans;
    }

    public int maximumCount(int[] nums) {
        int nc = lastNegative(nums) + 1;
        int pc = nums.length - firstPositive(nums);
        return Math.max(nc, pc);
    }
}
