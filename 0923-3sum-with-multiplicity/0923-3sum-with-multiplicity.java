class Solution {
    public int threeSumMulti(int[] arr, int target) {
        Arrays.sort(arr);

        long ans = 0;
        final int MOD = 1_000_000_007;

        for (int i = 0; i < arr.length - 2; i++) {

            int l = i + 1;
            int r = arr.length - 1;

            while (l < r) {

                long sum = arr[i] + arr[l] + arr[r];

                if (sum > target) {
                    r--;
                } 
                else if (sum < target) {
                    l++;
                } 
                else {

                    if (arr[l] != arr[r]) {

                        long lc = 1;
                        long rc = 1;

                        while (l + 1 < r && arr[l] == arr[l + 1]) {
                            l++;
                            lc++;
                        }

                        while (l < r - 1 && arr[r] == arr[r - 1]) {
                            r--;
                            rc++;
                        }

                        ans += lc * rc;

                    } 
                    else {

                        long n = r - l + 1;
                        ans += n * (n - 1) / 2;

                        break;
                    }

                    ans %= MOD;

                   
                    l++;
                    r--;
                }
            }
        }

        return (int) (ans % MOD);
    }
}