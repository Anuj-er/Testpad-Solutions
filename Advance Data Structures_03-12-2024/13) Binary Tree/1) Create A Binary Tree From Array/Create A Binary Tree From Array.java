static Node buildTree(int arr[], int n) {
    if (n == 0) return null; 
    Node root = new Node(arr[0]); 
    Queue<Node> queue = new LinkedList<>(); 
    queue.add(root); 
    int i = 1;
    while (i < n) {
        Node current = queue.poll(); 
        if (i < n) {
            current.left = new Node(arr[i]); 
            queue.add(current.left); 
            i++;
        }
        if (i < n) {
            current.right = new Node(arr[i]);
            queue.add(current.right); 
            i++;
        }
    }
    return root; 
}