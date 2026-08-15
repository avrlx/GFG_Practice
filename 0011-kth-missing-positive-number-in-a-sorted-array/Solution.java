class Solution {
    public int kthMissing(int[] arr, int k) {
        // code here
        int low = 0;
        int high = arr.length -1;
        while(low<=high){
            int mid = low +( high - low)/2;
            int orig = mid + 1;
            int missing = arr[mid] - orig;
            if(missing >= k) high = mid -1;
            else {
                low = mid +1;
            }
        }
        return high +1+ k;
    }
}