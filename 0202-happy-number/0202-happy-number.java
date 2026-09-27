class Solution {
    int sum(int n){
        int s=0;
        while(n>0){
            int digit = n % 10;
            s += digit * digit;
            n /= 10;
        }
        return s;
    }
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do{
            slow=sum(slow);
            fast=sum(sum(fast));
        }while(slow!=fast);

        return slow==1;
    }
}