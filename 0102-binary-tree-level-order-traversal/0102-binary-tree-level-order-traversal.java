class Solution {

    public List<List<Integer>> levelOrder(TreeNode root) {

        Map<Integer, List<Integer>> map = new HashMap<>();

        solve(root, 0, map);

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < map.size(); i++) {
            ans.add(map.get(i));
        }

        return ans;
    }

    void solve(TreeNode root, int level, Map<Integer, List<Integer>> map) {

        if (root == null) return;

        map.putIfAbsent(level, new ArrayList<>());

        map.get(level).add(root.val);

        solve(root.left, level + 1, map);
        solve(root.right, level + 1, map);
    }
}