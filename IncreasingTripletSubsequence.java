class Solution {
    public boolean increasingTriplet(int[] nums) {
        int[] ans = new int[3];
        int fst = Integer.MAX_VALUE;
        int sec = Integer.MAX_VALUE;
        int thr = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int ele = nums[i];
            if (fst >= ele) {
                fst = ele;
            } else if (fst < ele && sec >= ele) {
                sec = ele;
            } else {
                thr = ele;
                return true;
            }
        }
        return false;
    }
}
