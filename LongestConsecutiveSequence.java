class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        Arrays.sort(nums);
        int count = 1;
        int longcount = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                if (nums[i] == nums[i - 1] + 1) {
                    count++;
                }
                else{
                    longcount=Math.max(count,longcount);
                    count=1;
                }
            }
        }
        
        return Math.max(count,longcount);
    }
}
