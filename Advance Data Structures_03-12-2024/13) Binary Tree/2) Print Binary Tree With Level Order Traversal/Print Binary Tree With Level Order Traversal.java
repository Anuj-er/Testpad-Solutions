static void printLevelWise(Node root) {
    if (root == null) {
        return;
    }
    Queue<Node> queue = new LinkedList<>();
    queue.add(root); 
    while (!queue.isEmpty()) {
        int levelSize = queue.size(); 
        for (int i = 0; i < levelSize; i++) {
            Node current = queue.poll();
            System.out.print(current.data);
            if (i < levelSize - 1) {
                System.out.print(" ");
            }
            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }
        System.out.println();
    }
}