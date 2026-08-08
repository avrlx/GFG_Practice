class Solution {
    ArrayList<Integer> find(int arr[], int k) {
        // code here
        ArrayList <Integer> a = new ArrayList<>();
        
        int low =0;
        int high = arr.length -1;
        int index = -1;
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] > k) high = mid -1;
            else if ( arr[mid]< k) low = mid + 1 ;
            else {
                index = mid;
                high = mid -1;
            }
        }
        a.add(index);
        low = 0;
        high = arr.length -1;
        index = -1;
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] > k) high = mid -1;
            else if ( arr[mid]< k) low = mid + 1 ;
            else {
                index = mid;
                low = mid + 1;
            }
        }
        a.add(index);
        return a;