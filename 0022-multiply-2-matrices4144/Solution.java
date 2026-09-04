class Solution {
    public ArrayList<ArrayList<Integer>> multiply(int[][] mat1, int[][] mat2) {
        // code here
        
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        for(int i =0;i<mat1.length;i++){
            arr.add(new ArrayList<>());
            for(int j =0;j<mat1.length;j++){
                int sum = 0;
                for(int k =0;k<mat1.length;k++)
                    sum += mat1[i][k] * mat2[k][j];
                arr.get(i).add(sum);
            }
        }
        return arr;
    }
}