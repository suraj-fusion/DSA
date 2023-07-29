class Solution {
    public int strStr(String haystack, String needle) {
      

        int i=0;
        int j=0;
        while(i<haystack.length())
        {
            if(haystack.charAt(i)==needle.charAt(j))
            {
                int k=i;
                String rs="";
                while( k!=haystack.length() && rs.length()!=needle.length())
                {
                    rs=rs+haystack.charAt(k);
                    k++;
                }
                if(rs.equals(needle))
                {
                    return i;
                }
            }
            i++;
        }
        return -1;

      
    }
}