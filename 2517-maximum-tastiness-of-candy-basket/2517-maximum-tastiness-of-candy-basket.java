class Solution {
    public int maximumTastiness(int[] price, int k) {

        Arrays.sort(price);

        int low = 0;
        int high = price[price.length - 1] - price[0];

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canChoose(price, k, mid)) {
                low = mid + 1;    
            } else {
                high = mid - 1;    
            }
        }

        return high;
    }

    private boolean canChoose(int[] price, int k, int diff) {
        int count = 1;
        int last = price[0];

        for (int i = 1; i < price.length; i++) {

            if (price[i] - last >= diff) {
                count++;
                last = price[i];
            }

            if (count >= k) {
                return true;
            }
        }

        return false;
    }
}