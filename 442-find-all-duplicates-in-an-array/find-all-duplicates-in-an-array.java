class Solution {
    public List<Integer> findDuplicates(int[] nums) {
         List<Integer>  al = new ArrayList<Integer> ();
         HashSet<Integer> hs = new HashSet<Integer>();

         for(int i=0;i<nums.length;i++)
         {
             if(hs.contains(nums[i]))
             {
                 al.add(nums[i]);
             }
             else
             {
                 hs.add(nums[i]);
             }
         }

         return al;
    }
}