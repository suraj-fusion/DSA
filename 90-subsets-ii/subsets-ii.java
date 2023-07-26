class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp=new ArrayList<Integer>();

         subsets(nums,ans,temp,0);

         for(List<Integer> e:ans)
         {
             Collections.sort(e);
         }
         HashSet<List<Integer>> hs = new HashSet<>();
         for(List<Integer> e : ans)
         {
             hs.add(e);
         }
          List<List<Integer>> ans2 = new ArrayList<>();
          for(List<Integer> e: hs)
          {
              ans2.add(e);
          }
          return ans2;
        
    }

    static void subsets(int nums[],List<List<Integer>> ans,List<Integer> temp,int i)
    {
         if(i==nums.length)
         {
            

             
                 ans.add(new ArrayList<>(temp));
                
             
              return;
         }       

       subsets(nums,ans,temp,i+1);
       temp.add(nums[i]);
       subsets(nums,ans,temp,i+1);
       temp.remove(temp.size() - 1);
      
    }
}