class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer>  al = new ArrayList<Integer> ();
        Arrays.sort(nums);

        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==nums[i-1])
            {
                al.add(nums[i]);
            }
        }

        return al;
    }
}