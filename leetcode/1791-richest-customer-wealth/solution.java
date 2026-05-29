class Solution {
    public int maximumWealth(int[][] accounts) {
        int arr[]=new int[accounts.length];
        for(int i=0;i<accounts.length;i++){
            int c=0;
            for(int j=0;j<accounts[i].length;j++){
                c=c+accounts[i][j];
            }
            arr[i]=c;
        }
        int max=0;
        for(int x=0;x<arr.length;x++){
            if(arr[x]>max){
                max=arr[x];
            }
        }
        return max;
    }
}
