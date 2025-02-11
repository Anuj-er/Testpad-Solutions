class Result {
    static boolean isMirror(Node n1, Node n2) {
        if (n1 == null && n2 == null) return true;
        if (n1 == null || n2 == null) return false;
        return isMirror(n1.left, n2.right) && isMirror(n1.right, n2.left);
    }
    static int isFoldable(Node root) {
        if (root == null) return 1; // A null tree is foldable
        return isMirror(root.left, root.right) ? 1 : 0;
    }
}