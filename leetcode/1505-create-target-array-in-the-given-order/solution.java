class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> target=new ArrayList<>();
        for(int i=0;i<index.length;i++){
            //int c=index[i];
                
                target.add(index[i],nums[i]);
            
    }
    
    for(int j=0;j<target.size();j++){
        nums[j]=target.get(j);
}
return nums;
}
}
