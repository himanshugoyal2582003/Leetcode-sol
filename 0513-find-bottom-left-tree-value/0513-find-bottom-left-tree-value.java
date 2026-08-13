
class Solution {
    public int findBottomLeftValue(TreeNode root) {
        List<Integer> ans = new ArrayList<>();

        if (root == null) {
            return 0;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {

            int size = q.size();
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < size; i++) {

                TreeNode node = q.poll();
                level.add(node.val);

                if (node.left != null) {
                    q.add(node.left);
                }

                if (node.right != null) {
                    q.add(node.right);
                }
            }

            ans.add(level.get(0));
        }

        return Integer.valueOf(ans.get(ans.size()-1));
    }
}