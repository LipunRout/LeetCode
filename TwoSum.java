class Solution {
    public int[] twoSum(int[] nums, int target) {
        int length=nums.length;
        int[] ans =new int[2];
        for (int i=0;i<length;i++){
            for (int j=i+1;j<length;j++){
               
                if((nums[i]+nums[j])==target){
                    ans[0]=i;
                    ans[1]=j;
                    break;
                }
            }
        }
        return ans; 
    }
}
