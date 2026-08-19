class Solution {
    public ArrayList<ArrayList<Integer>> transpose(int[][] arr) {
        // code here
        ArrayList<ArrayList<Integer>> mat = new ArrayList<>();
        
        for (int i = 0; i < arr[0].length ; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j <arr.length ; j++) {
                    row.add(arr[j][i]);
            }
            mat.add(row);
        }
        return mat;
    }
}