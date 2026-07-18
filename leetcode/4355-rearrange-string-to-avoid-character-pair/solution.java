class Solution {
    public String rearrangeString(String s, char x, char y) {
        if(s.contains(String.valueOf(x)) && s.contains(String.valueOf(y))){
            
            String ypart="";
            String other="";
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)==y){
                    ypart+=s.charAt(i);
                }
                else{
                    other+=s.charAt(i);
                }
            }
            return ypart+other;
        }
        else{
            return s;
        }
    }
}
