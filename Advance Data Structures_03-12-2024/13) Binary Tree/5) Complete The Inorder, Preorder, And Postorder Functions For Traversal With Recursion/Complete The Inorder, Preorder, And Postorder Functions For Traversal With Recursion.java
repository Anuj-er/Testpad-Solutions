static void inorder(Node root) {
    if (root == null) {
        return;
    }
    inorder(root.leftChild);  
    System.out.print(root.data + " "); 
    inorder(root.rightChild);
}
static void preorder(Node root) {
    if (root == null) {
        return;
    }
    System.out.print(root.data + " "); 
    preorder(root.leftChild); 
    preorder(root.rightChild);  
}
static void postorder(Node root) {
    if (root == null) {
        return;
    }
    postorder(root.leftChild);
    postorder(root.rightChild);  
    System.out.print(root.data + " ");
}