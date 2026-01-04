class Solution {
    public String largestEven(String s) {
        int lt=-1;
        for(int i=s.length()-1;i>=0;i--){
            if (s.charAt(i)=='2'){
                lt=i;
                break;
            }
        }
        if(lt==-1){
            return "" ;
        }
        else{
            return s.substring(0,lt+1);
        }
    }
}
