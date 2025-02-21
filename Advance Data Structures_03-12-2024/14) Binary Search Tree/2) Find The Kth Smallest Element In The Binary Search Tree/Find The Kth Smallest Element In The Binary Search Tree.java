static int kSmallest(Node root, int k) {
    int[] count = new int[1];
    int[] result = new int[1];
  
    inorderTraversal(root, k, count, result);
    
    return result[0];
}

static boolean inorderTraversal(Node root, int k, int[] count, int[] result) {
    if (root == null) return false;
    
    if (inorderTraversal(root.left, k, count, result)) {
        return true;
    }
    
    count[0]++;
    if (count[0] == k) {
        result[0] = root.data;
        return true;
    }
    
    return inorderTraversal(root.right, k, count, result);
}
