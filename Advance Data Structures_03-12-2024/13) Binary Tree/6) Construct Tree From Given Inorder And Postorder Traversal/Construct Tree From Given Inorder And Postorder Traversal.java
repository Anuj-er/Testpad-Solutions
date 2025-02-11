class Result {
    static Node buildTree(int in[], int post[], int N) {
        int[] postIndex = { N - 1 };
        return buildTreeHelper(in, post, 0, N - 1, postIndex);
    }
    static Node buildTreeHelper(int in[], int post[], int inStart, int inEnd, int[] postIndex) {
        if (inStart > inEnd) {
            return null;
        }
        int rootValue = post[postIndex[0]--];
        Node root = new Node(rootValue);
        int rootIndex = findRootIndex(in, inStart, inEnd, rootValue);
        root.rightChild = buildTreeHelper(in, post, rootIndex + 1, inEnd, postIndex);
        root.leftChild = buildTreeHelper(in, post, inStart, rootIndex - 1, postIndex);
        return root;
    }
    static int findRootIndex(int in[], int inStart, int inEnd, int value) {
        for (int i = inStart; i <= inEnd; i++) {
            if (in[i] == value) {
                return i;
            }
        }
        return -1;
    }
    static void printPreorder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            printPreorder(root.leftChild);
            printPreorder(root.rightChild);
        }
    }
}