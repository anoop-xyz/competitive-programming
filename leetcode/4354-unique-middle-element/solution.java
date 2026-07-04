class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int n=nums.length;
        int c=0;
        for(int i=0;i<n;i++)
        {
        if(nums[(int) Math.ceil(n/2)]==nums[i]){
            c+=1;
        }
            
            
            }
        if(c!=1){
            return false;
        }
        else{
            return true;
        }
    }
}
