class Solution {
    public String longestPalindrome(String s) {
     
     String res="";
     int relen=0;
     for(int i=0;i<s.length();i++)
     {
         int l=i;
         int r=i;
         while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r))
         {
              if(r-l+1 > relen)
              {
                  res=s.substring(l,r+1);
                  relen=r-l+1;
              }
              l--;
              r++;
         }

         int k=i;
         int m=i+1;
         while(k>=0 && m<s.length() && s.charAt(k)==s.charAt(m))
         {
              if(m-k+1 > relen)
              {
                  res=s.substring(k,m+1);
                  relen=m-k+1;
              }
              k--;
              m++;
         }


     }

     return res;
}
}