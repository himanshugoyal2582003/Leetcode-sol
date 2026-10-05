class Solution {
    public int scoreOfParentheses(String s) {
         int c =0 ;
        int max =0;

        for(int i =0 ; i<s.length();i++){
            char ch = s.charAt(i);

            if(ch=='('){
                c++;
               
            }else if(ch==')'){
                 
                c--;

                if (s.charAt(i - 1) == '(') {
                    max += 1 << c;
                }
            }
        }
        return max;

    }
}