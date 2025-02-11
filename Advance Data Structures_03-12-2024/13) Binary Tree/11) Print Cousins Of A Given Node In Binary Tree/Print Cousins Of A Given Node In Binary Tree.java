import java.util.*;
class Result {
    static void printCousins(Node root, int k) {
        if (root == null || root.data == k) {
            System.out.println(-1);
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        boolean found = false;
        while (!queue.isEmpty() && !found) {
            int size = queue.size();
            List<Integer> cousins = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                Node node = queue.poll();
                // Check if this node's child is the target node
                if ((node.leftChild != null && node.leftChild.data == k) ||
                    (node.rightChild != null && node.rightChild.data == k)) {
                    found = true;
                } else {
                    // Add children to the cousins list
                    if (node.leftChild != null) cousins.add(node.leftChild.data);
                    if (node.rightChild != null) cousins.add(node.rightChild.data);
                    if (node.leftChild != null) queue.add(node.leftChild);
                    if (node.rightChild != null) queue.add(node.rightChild);
                }
            }
            // If we found the target's parent in this level, print the collected cousins
            if (found) {
                if (cousins.isEmpty()) System.out.println(-1);
                else {
                    for (int cousin : cousins) {
                        System.out.print(cousin + " ");
                    }
                    System.out.println();
                }
                return;
            }
        }
        System.out.println(-1);
    }
}