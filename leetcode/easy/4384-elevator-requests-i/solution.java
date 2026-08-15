class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int total=0;
        int cf=0;
        for(int i=0;i<requests.length;i++){
            total=total+Math.abs(cf-requests[i]);
            cf=requests[i];
        }
        return total;
        
    }
}