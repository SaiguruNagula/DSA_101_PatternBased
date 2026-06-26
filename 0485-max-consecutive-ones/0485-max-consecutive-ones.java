class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxl=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
            }else{
                count =0;
            }
            maxl=Math.max(maxl,count);
        }

        return maxl;
    }
}