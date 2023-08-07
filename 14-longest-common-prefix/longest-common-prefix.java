class Solution {
    public String longestCommonPrefix(String[] strs) {

         if(strs.length==0)
         {
             return "";
         }
         Arrays.sort(strs);
         int i=0;
         String res="";
         while(i<strs[0].length() && i<strs[strs.length-1].length())
         {
             if(strs[0].charAt(i)==strs[strs.length-1].charAt(i))
             {
                 res+=strs[0].charAt(i);
                 i++;
             }
             else
             {
                 break;
             }
         }
         return res;
    }
}