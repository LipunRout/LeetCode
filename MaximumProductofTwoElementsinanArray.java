class Solution {
    public int maxProduct(int[] nums) {
        
        int fst =Integer.MIN_VALUE;
        int sec =Integer.MIN_VALUE;

        for (int i=0;i<nums.length;i++){
            if(nums[i]>fst){
                sec=fst;
                fst=nums[i];

            }else if(sec<nums[i] && sec!=fst){
                sec=nums[i];

            }
        }
        int mul=(sec-1)*(fst-1);
        return mul;
    }
}
