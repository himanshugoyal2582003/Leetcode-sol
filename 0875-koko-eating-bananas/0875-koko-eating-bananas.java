class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l =1;
        int hi =0;

        for(int pile : piles){
            hi= Math.max(hi,pile);
        }

        while(l<hi){
            int mid = l + (hi-l)/2;

            long hour =0 ;

            for(int pile : piles){
                hour += (pile+mid-1)/mid;
            }

            if(hour<=h){
                hi=mid;
            }else{
                l=mid+1;
            }
        }
        return l;
    }
}