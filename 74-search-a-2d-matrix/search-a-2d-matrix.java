class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

      int low=0;
      int high=matrix.length-1;
      int mid=(low+high)/2;
      while(low<=high)
      {
          mid=(low+high)/2;
          if(matrix[mid][0] > target  )
          {
              high=mid-1;
          }
          else if(matrix[mid][0] <=target && matrix[mid][matrix[mid].length-1]>=target )
          {
               break;
          }
          else
          {
              low=mid+1;
          }
      }

    
    
    
       int low2=0;
       int high2=matrix[mid].length-1;
       while(low2<=high2)
       {
           int mid2=(low2+high2)/2;
           if(matrix[mid][mid2]>target)
           {
               high2=mid2-1;
           }
           else if(matrix[mid][mid2]<target)
           {
                     low2=mid2+1;
           }
           else if(matrix[mid][mid2]==target)
           {
                    return true;
           }
       }

       return false;      
    }
}