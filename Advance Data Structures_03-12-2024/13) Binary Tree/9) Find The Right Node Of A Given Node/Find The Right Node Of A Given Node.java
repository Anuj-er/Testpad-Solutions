class Result {
    static int findRightSibling(Node root, int key) {
        if (root == null) return -1;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node current = queue.poll();
                if (current.data == key) {
                    if (i < size - 1) {
                        return queue.peek().data; // Right sibling found
                    } else {
                        return -1; // No right sibling
                    }
                }
                if (current.left != null) queue.add(current.left);
                if (current.right != null) queue.add(current.right);
            }
        }
        return -1; // Key not found
    }
}