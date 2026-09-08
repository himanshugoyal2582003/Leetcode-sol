class Solution {
    public boolean judgeSquareSum(int c) {
        int l =0;
        int r= (int) Math.sqrt(c);

        while(l<=r){
            long n = (long)l*l +r*r;

            if(n==c){
                return true;
            }else if(n<c){
                l++;
            }else{
                r--;
            }
        }
        return false;
    }
}