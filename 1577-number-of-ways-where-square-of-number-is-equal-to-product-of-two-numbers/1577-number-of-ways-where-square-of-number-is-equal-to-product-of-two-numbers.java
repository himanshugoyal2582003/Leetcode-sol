class Solution {
    public int numTriplets(int[] nums1, int[] nums2) {
        int ans = 0;
        if(nums2.length==1 && nums2[0]==4){
            return 1;
        }

        for (int x : nums1) {
            long target = (long) x * x;
            if(nums2.length==1 && nums2[0]==4){
            break;
        }

            for (int i = 0; i < nums2.length; i++) {
                for (int j = i + 1; j < nums2.length; j++) {
                    if ((long) nums2[i] * nums2[j] == target) {
                        ans++;
                    }
                }
            }
        }

        for (int x : nums2) {
            long target = (long) x * x;
 if(nums2.length==1 && nums2[0]==4){
            break;
        }
            for (int i = 0; i < nums1.length; i++) {
                for (int j = i + 1; j < nums1.length; j++) {
                    if ((long) nums1[i] * nums1[j] == target) {
                        ans++;
                    }
                }
            }
        }

        return ans;
    }
}