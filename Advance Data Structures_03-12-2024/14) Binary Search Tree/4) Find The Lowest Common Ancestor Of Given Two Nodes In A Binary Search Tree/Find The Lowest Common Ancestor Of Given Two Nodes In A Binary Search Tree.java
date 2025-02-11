class Result {
    static int lowestCommonAncestor(Node root, int k1, int k2) {
        if (root == null) return -1;
        if (root.data > k1 && root.data > k2) {
            return lowestCommonAncestor(root.left, k1, k2);
        }
        if (root.data < k1 && root.data < k2) {
            return lowestCommonAncestor(root.right, k1, k2);
        }
        return root.data;
    }
}