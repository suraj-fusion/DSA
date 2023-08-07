class Solution {
    public String longestCommonPrefix(String[] strs) {

         if(strs.length==0)
         {
             return "";
         }
        String base=strs[0];
        int common=strs[0].length();
        for(int i=1;i<strs.length;i++)
        {
            String curr=strs[i];
            int j=0;
         
            while(j<base.length() && j<curr.length())
            {
                if(base.charAt(j)==curr.charAt(j))
                {
                    j++;
                    
                }
                else
                {
                    break;
                }
            }
            common=Math.min(j,common);
        }

        String res="";
        for(int k=0;k<common;k++)
        {
            res+=strs[0].charAt(k);
        }
        return res;
        
    }
}