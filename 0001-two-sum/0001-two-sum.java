class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[] ans=new int[2];
        
        HashMap<Integer,Integer> hm =new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            hm.put(nums[i],i);
        }
        
        for(int i=0;i<nums.length;i++)
        {
            int check=target-nums[i];
            if(hm.keySet().contains(check) && hm.get(check)!=i)
            {
                ans[0]=i;
                ans[1]=hm.get(check);
            }
        }
        return ans;
        
       
       
    }
}