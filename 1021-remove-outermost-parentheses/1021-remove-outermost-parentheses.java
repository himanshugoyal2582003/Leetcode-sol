class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder ans = new StringBuilder();

        int c =0;

        for(char i : s.toCharArray()){
            if(i=='('){
                if(c>0){
                    ans.append(i);
                }
                c++;
            }else{
                c--;
                if(c>0){
                    ans.append(i);
                }
            }
        }

        return ans.toString();
    }
}