class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int num=0;
        int tCount=0;

        for(int l : nums){
            if(l==target){
                tCount++;
            }
            else if(l<target){
                num++;
            }
        }
        List<Integer> ans=new ArrayList<>();
        while(tCount>0){
            ans.add(num);
            num++;
            tCount--;
        }
        return ans;
    }

}
