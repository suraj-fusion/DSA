class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
      
        int i=m-1;
        int j=0;
       while( m!=0 && n!=0 && i>=0 && j<n)
       {
           if(nums1[i]>nums2[j])
           {
               int temp=nums1[i];
               nums1[i]=nums2[j];
               nums2[j]=temp;
               i--;
               j++;
           }
           else
           {
               break;
           }
       }

        Arrays.sort(nums1,0,m);
        Arrays.sort(nums2);
        int k=m;
        int t=0;
        
        while(k<nums1.length)
        {
            nums1[k]=nums2[t];
            k++;
            t++;
        }
        
    }
}