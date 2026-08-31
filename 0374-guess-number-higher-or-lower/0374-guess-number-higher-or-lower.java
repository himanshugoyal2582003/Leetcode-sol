public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int l = 1;
        int r = n;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            int res = guess(mid);

            if (res == 0) {
                return mid;
            } 
            else if (res == -1) {
                // hidden number is smaller
                r = mid - 1;
            } 
            else {
                // hidden number is larger
                l = mid + 1;
            }
        }

        return -1;
    }
}