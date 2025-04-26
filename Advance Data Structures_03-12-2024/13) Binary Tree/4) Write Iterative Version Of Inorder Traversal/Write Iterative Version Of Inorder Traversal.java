static void printInorder(Node root) {
        if (root == null) {
            return;
        }
        Node current = root;
        Node[] stack = new Node[100000];
        int top = -1;
        while (current != null || top >= 0) {
            while (current != null) {
                stack[++top] = current;
                current = current.leftChild;
            }
            current = stack[top--];
            System.out.print(current.data + " ");
            current = current.rightChild;
        }
    }
