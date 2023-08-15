class Solution {
    public int maxProduct(int[] nums) {

        int prefix=1;
        int suffix=1;
        int maxprefix=Integer.MIN_VALUE;
        int maxsuffix=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            prefix=prefix*nums[i];
            suffix=suffix*nums[nums.length-1-i];

           maxprefix=Math.max(prefix,maxprefix);
           maxsuffix=Math.max(suffix,maxsuffix);

           
            if(prefix==0)
            { prefix=1;
            }

            if(suffix==0) 
            {suffix=1;
            }
        }
        return Math.max(maxsuffix,maxprefix);
        
      
}
}