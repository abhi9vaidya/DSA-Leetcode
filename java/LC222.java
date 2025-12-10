
// LeetCode 222. Count Complete Tree Nodes
// Time: O(n), Space: O(h) where h = height
public class LC222 {
    public static void main(String[] args) {
        // Example: build a tree with 6 nodes
        TreeNode root = new TreeNode(1,
            new TreeNode(2, new TreeNode(4), new TreeNode(5)),
            new TreeNode(3, new TreeNode(6), null)
        );
        Solution sol = new Solution();
        System.out.println("Node count: " + sol.countNodes(root)); // Should print 6
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public int countNodes(TreeNode root) {
        if (root == null) return 0;
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
}