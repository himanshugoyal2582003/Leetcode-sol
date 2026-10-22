class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int zero = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                zero = i;
                break;
            }
        }

        boolean forward = true;
        boolean backward = true;

        for (int i = 0; i < n; i++) {
            int next = (i + 1) % n;

            if (nums[next] != (nums[i] + 1) % n) {
                forward = false;
            }

            if (nums[i] != (nums[next] + 1) % n) {
                backward = false;
            }
        }

        if (!forward && !backward) {
            return -1;
        }

        int target = forward ? zero : n - 1 - zero;

        int size = 2 * n;
        int[] dist = new int[size];
        java.util.Arrays.fill(dist, -1);

        java.util.Queue<Integer> queue =
            new java.util.LinkedList<>();

        queue.offer(0);
        dist[0] = 0;

        while (!queue.isEmpty()) {
            int state = queue.poll();

            int orientation = state / n;
            int k = state % n;

            if (orientation == 0 && forward && k == target) {
                return dist[state];
            }

            if (orientation == 1 && backward && k == target) {
                return dist[state];
            }

            // Rotate left by one
            int rotate = orientation * n + (k + 1) % n;

            if (dist[rotate] == -1) {
                dist[rotate] = dist[state] + 1;
                queue.offer(rotate);
            }

            // Reverse the entire array
            int reverse = (1 - orientation) * n
                        + (n - k) % n;

            if (dist[reverse] == -1) {
                dist[reverse] = dist[state] + 1;
                queue.offer(reverse);
            }
        }

        return -1;
    }
}