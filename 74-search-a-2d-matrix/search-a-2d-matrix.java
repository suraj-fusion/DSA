class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

      int row=-1;
      for(int i=0;i<matrix.length;i++)
      {
          if(target>=matrix[i][0] && target<=matrix[i][matrix[i].length-1] )
          {
              row=i;
              break;
          }
      }

      if(row==-1)
      {
          
          return false;
      }
    
      for(int i=0;i<matrix[row].length;i++)
      {
          if(target == matrix[row][i])
          {
              return true;
          }
      }
      return false;
}
}