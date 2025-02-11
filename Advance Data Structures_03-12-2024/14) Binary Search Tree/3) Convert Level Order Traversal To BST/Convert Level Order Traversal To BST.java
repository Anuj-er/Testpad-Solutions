class Result {
    static Node buildSearchTree(int[] t, int n) {
        if (n == 0) return null;
        Node root = new Node(t[0]);
        for (int i = 1; i < n; i++) {
            insertIntoBST(root, t[i]);
        }
        return root;
    }
    static void insertIntoBST(Node root, int key) {
        Node newNode = new Node(key);
        Node current = root;
        Node parent = null;
        while (current != null) {
            parent = current;
            if (key < current.data) {
                current = current.leftChild;
            } else {
                current = current.rightChild;
            }
        }
        if (key < parent.data) {
            parent.leftChild = newNode;
        } else {
            parent.rightChild = newNode;
        }
    }
    static void inorderTraversal(Node root) {
        if (root == null) return;
        inorderTraversal(root.leftChild);
        System.out.print(root.data + " ");
        inorderTraversal(root.rightChild);
    }
}