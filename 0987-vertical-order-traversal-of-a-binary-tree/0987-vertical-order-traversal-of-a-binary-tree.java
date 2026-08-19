class Solution {

    Map<Integer, Map<Integer, List<Integer>>> map = new HashMap<>();

    int min = 0;
    int max = 0;

    void solve(TreeNode root, int row, int col) {

        if (root == null)
            return;

        min = Math.min(min, col);
        max = Math.max(max, col);

        map.putIfAbsent(col, new HashMap<>());

        Map<Integer, List<Integer>> rows = map.get(col);

        rows.putIfAbsent(row, new ArrayList<>());

        rows.get(row).add(root.val);

        solve(root.left, row + 1, col - 1);
        solve(root.right, row + 1, col + 1);
    }

    public List<List<Integer>> verticalTraversal(TreeNode root) {

        solve(root, 0, 0);

        List<List<Integer>> ans = new ArrayList<>();

        for (int col = min; col <= max; col++) {

            List<Integer> list = new ArrayList<>();

            Map<Integer, List<Integer>> rows = map.get(col);

            for (int row : new TreeSet<>(rows.keySet())) {

                List<Integer> values = rows.get(row);

                Collections.sort(values);

                list.addAll(values);
            }

            ans.add(list);
        }

        return ans;
    }
}