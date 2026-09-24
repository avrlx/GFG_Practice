class Solution {
    public int countDistinct(int arr[]) {
        // code here
        Set<Integer> a = new HashSet<>();
        for (int i : arr) {
            a.add(i);
            
        }
        return a.size();
    }
}