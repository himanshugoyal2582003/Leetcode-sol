class Solution {
    public int shipWithinDays(int[] weights, int days) {
        

        int l=0;
        int h = 0;

        for(int w : weights){
            l= Math.max(l,w);
            h+=w;
        }
       
        while(l<h){
            int mid = l+(h-l)/2;


            int dU=1;
            int iw =0;


            for(int w : weights){
                if(iw + w >mid){
                    dU++;
                    iw=0;
                }

                iw+=w;
            }


            if(dU<=days){
                h=mid;
            }else{
                l=mid+1;
            }
        }
        return l;
    }
}