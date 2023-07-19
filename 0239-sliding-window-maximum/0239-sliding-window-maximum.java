class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
       
       int ans[]=new int[nums.length-k+1];
       ArrayDeque<Integer> q = new ArrayDeque<Integer>();
        int t=0;
       for(int i=0;i<nums.length;i++)
       {
           while( !q.isEmpty()  && q.peekFirst()==i-k)
           {
               q.removeFirst();
           }

           while(!q.isEmpty()  && nums[q.peekLast()]<= nums[i] )
           {
               q.removeLast();
           }

           q.addLast(i);
           if(i>=k-1)
           {
               ans[t++]=nums[q.peekFirst()];
           }
       }

       return ans;

    }
}