class Result {
    static Node buildTree(int[] levelOrder) {
        if (levelOrder.length == 0) return null;
        Node root = new Node(levelOrder[0]);
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int index = 1;
        while (!queue.isEmpty() && index < levelOrder.length) {
            Node current = queue.poll();
            if (levelOrder[index] != -1) {
                current.left = new Node(levelOrder[index]);
                queue.add(current.left);
            }
            index++;
            if (index < levelOrder.length && levelOrder[index] != -1) {
                current.right = new Node(levelOrder[index]);
                queue.add(current.right);
            }
            index++;
        }
        return root;
    }
    static int countLeafs(Node root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) {
            return 1;
        }
        return countLeafs(root.left) + countLeafs(root.right);
    }
    static int countNonLeafs(Node root) {
        if (root == null) return 0;
        if (root.left != null || root.right != null) {
            return 1 + countNonLeafs(root.left) + countNonLeafs(root.right);
        }
        return 0;
    }
}