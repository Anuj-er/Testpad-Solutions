class Result {
    // Helper class to store node and its horizontal distance
    static class Pair {
        Node node;
        int hd; // Horizontal Distance
        Pair(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }
    static void printTopView(Node root) {
        if (root == null) return;
        // TreeMap to store first node at each horizontal distance
        TreeMap<Integer, Integer> topViewMap = new TreeMap<>();
        Queue<Pair> queue = new LinkedList<>();
        // Start with root at horizontal distance 0
        queue.add(new Pair(root, 0));
        while (!queue.isEmpty()) {
            Pair current = queue.poll();
            Node node = current.node;
            int hd = current.hd;
            // If horizontal distance is seen for the first time, store it
            if (!topViewMap.containsKey(hd)) {
                topViewMap.put(hd, node.data);
            }
            // Add left and right children with updated horizontal distances
            if (node.left != null) queue.add(new Pair(node.left, hd - 1));
            if (node.right != null) queue.add(new Pair(node.right, hd + 1));
        }
        // Print the top view nodes in sorted order of horizontal distances
        for (int value : topViewMap.values()) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}