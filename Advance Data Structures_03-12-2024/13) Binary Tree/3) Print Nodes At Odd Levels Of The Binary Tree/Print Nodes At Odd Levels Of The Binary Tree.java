class Result {
    static void printOdd(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int level = 1;
        while (!queue.isEmpty()) {
            int levelSize = queue.size();  
            for (int i = 0; i < levelSize; i++) {
                Node current = queue.poll();
                if (level % 2 != 0) {
                    System.out.print(current.data + " ");
                }
                if (current.left != null) {
                    queue.add(current.left);
                }
                if (current.right != null) {
                    queue.add(current.right);
                }
            }
            level++;
        }
    }
}