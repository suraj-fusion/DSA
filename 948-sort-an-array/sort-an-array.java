class Solution {
    public int[] sortArray(int[] nums) {

           MergeSort(nums,0,nums.length-1);
           return nums;
        
    }


    void MergeSort(int [] nums,int low,int high)
    {
    if(low==high)
    {
        return;
    }
       int mid=(low+high)/2;

       MergeSort(nums,low,mid);
       MergeSort(nums,mid+1,high);
       Merge(nums,low,mid,high);
        
    }

    void Merge(int nums[],int low,int mid,int high)
   {
       ArrayList<Integer> al = new ArrayList<Integer>();
       int i=low;
       int j=mid+1;
       while(i<=mid && j<=high)
       {
           if(nums[i]<=nums[j])
           {
               al.add(nums[i]);
               i++;
           }
           else
           {
               al.add(nums[j]);
               j++;
           }
       }

       while(i<=mid)
       {
           al.add(nums[i]);
           i++;
       }

        while(j<=high)
       {
           al.add(nums[j]);
           j++;
       }

     int k=0;
     for(int t=low;t<=high;t++)
     {
         nums[t]=al.get(k);
         k++;
     }
       

   }
}