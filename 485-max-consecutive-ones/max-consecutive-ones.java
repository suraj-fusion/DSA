class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int count=0;
        int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                ans=Math.max(ans,count);
                count=0;
            }
            else
            {
                count++;
            }
        }

        ans=Math.max(ans,count);
        return ans;


    }
}