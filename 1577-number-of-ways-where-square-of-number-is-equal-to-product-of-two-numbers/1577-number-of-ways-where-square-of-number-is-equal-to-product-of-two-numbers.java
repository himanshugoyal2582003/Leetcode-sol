class Solution {
    public int numTriplets(int[] nums1, int[] nums2) {
        return solve(nums1, nums2) + solve(nums2, nums1);
    }

    int solve(int[] a, int[] b) {
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int x : b)
            map.put(x, map.getOrDefault(x, 0) + 1);

        for (int x : a) {
            long target = (long) x * x;

            for (int y : map.keySet()) {
                if (target % y == 0) {
                    long z = target / y;

                    // if (z > Intege/r.MAX_VALUE) continue;

                    if (map.containsKey((int) z)) {
                        if (y < z)
                            ans += map.get(y) * map.get((int) z);
                        else if (y == z) {
                            int c = map.get(y);
                            ans += c * (c - 1) / 2;
                        }
                    }
                }
            }
        }

        return ans;
    }
}