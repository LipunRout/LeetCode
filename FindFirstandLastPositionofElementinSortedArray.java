class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = { -1, -1 };

        if (ans.length == 0) {
            return ans;
        }
        ans[0] = firstOccur(nums, target);
        ans[1] = lastOccur(nums, target);

        return ans;

    }

    public int firstOccur(int[] nums, int target) {
        int ans = -1;
        int st = 0;
        int end = nums.length - 1;
        while (st <= end) {
            int mid = (st + end) / 2;
            if (nums[mid] == target) {
                ans = mid;
                end = mid - 1;
            } else if (target > nums[mid]) {
                st = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    public int lastOccur(int[] nums, int target) {
        int ans = -1;
        int st = 0;
        int end = nums.length - 1;
        while (st <= end) {
            int mid = (st + end) / 2;
            if (nums[mid] == target) {
                ans = mid;
                st = st + 1;
            } else if (target > nums[mid]) {
                st = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }
}
