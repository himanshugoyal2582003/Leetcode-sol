class Solution {
    int sum(int a){
         String h = ""+a;
         int Sum =0;
         for(int i =0 ; i< h.length(); i++){
            int d = h.charAt(i)-'0';
            Sum = Sum + d*d;
         }
         return Sum;
    }
    public boolean isHappy(int n) {
        while(n>=9){
             n = sum(n);
        }
        if(n==1 || n==7){return true;}
        return false;
    }
}