class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> ans=new ArrayList<>();
        int m=matrix.length;
        int n=matrix[0].length;
        int sr=0;
        int sc=0;
        int er=m-1;
        int ec=n-1;
        while( sr<=er && sc<=ec )
        {
            for(int i=sc;i<=ec;i++){
                ans.add(matrix[sr][i]);
            }
            for(int i=sr+1;i<=er;i++){
                ans.add(matrix[i][ec]);
            }
            if(sr==er){
                    break;
                }
            for(int i=ec-1;i>=sc;i--){
                ans.add(matrix[er][i]);
                
            }
            if(sc==ec){
                    break;
                }
            for(int i=er-1;i>=sr+1;i--){
                ans.add(matrix[i][sc]);
                

            }
            sr+=1;
            sc+=1;
            er-=1;
            ec-=1;
        }
        return ans;

    }
}
