class Solution {
    public int rob(int[] nums) {
        int num1 = 0;
        int num2 = 0;

        for( int m : nums){
            int c = Math.max(num1 , num2 +m);
            num2 = num1;
            num1 = c; 
        } 
        return num1;
    }
}