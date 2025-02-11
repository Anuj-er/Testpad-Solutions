void printInorder(struct Node* root) {
    if (root == NULL) {
        return;
    }
    struct Node* current = root;
    struct Node* stack[100000]; 
    int top = -1; 
    while (current != NULL || top >= 0) {
        while (current != NULL) {
            stack[++top] = current;  
            current = current->left; 
        }
        current = stack[top--]; 
        printf("%d ", current->data);
        current = current->right;
    }
}