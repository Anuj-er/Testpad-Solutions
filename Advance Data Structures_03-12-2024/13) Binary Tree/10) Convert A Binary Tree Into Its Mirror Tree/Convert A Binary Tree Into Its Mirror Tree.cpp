void findMirror(Node* root) {
    if (root == nullptr) {
        return;
    }
    Node* temp = root->left;
    root->left = root->right;
    root->right = temp;
    findMirror(root->left);
    findMirror(root->right);
}
void inorder(Node* root) {
    if (root == nullptr) {
        return;
    }
    inorder(root->left);
    cout << root->data << " ";
    inorder(root->right);
}