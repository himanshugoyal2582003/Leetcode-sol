class Solution {
   public String reverse(String a) {
    String b = "";

    for (int i = a.length() - 1; i >= 0; i--) {
        b += a.charAt(i);
    }

    return b;
}

    public String reverseParentheses(String s) {
        Stack<String> stack = new Stack<>();

        String curr ="";

        for(int i =0 ; i<s.length();i++){
            char ch = s.charAt(i);

            if(ch=='('){
                stack.push(curr);
                curr="";
            }else if(ch==')'){
                curr= reverse(curr);

                String prev= stack.pop();
                curr=prev+curr;
            }else{
                curr+=ch;
            }
        }
        return curr;
    }
}