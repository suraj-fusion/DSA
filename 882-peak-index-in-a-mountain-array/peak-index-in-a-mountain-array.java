class Solution {
    public int peakIndexInMountainArray(int[] arr) {

        int low=0;
        int high=arr.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(mid!=0 && mid!=arr.length-1 && arr[mid-1]<arr[mid] &&  arr[mid]>arr[mid+1])
            {
                return mid;
            }
            else if(mid!=arr.length-1 && arr[mid]>arr[mid+1] )
            {
                high=mid-1;
            } 
            else
            {
                 low=mid+1;
            }
        }
        return -1;
    }
}