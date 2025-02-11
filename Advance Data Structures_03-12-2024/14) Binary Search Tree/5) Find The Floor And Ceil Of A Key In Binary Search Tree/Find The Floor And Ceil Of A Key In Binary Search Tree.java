class Result {
    static int floorOf(Node root, int key) {
        int floor = -1;
        while (root != null) {
            if (root.data == key) {
                return root.data;
            } else if (root.data < key) {
                floor = root.data; 
                root = root.rightChild;
            } else {
                root = root.leftChild;
            }
        }
        return floor;
    }
    static int ceilOf(Node root, int key) {
        int ceil = -1;
        while (root != null) {
            if (root.data == key) {
                return root.data;
            } else if (root.data > key) {
                ceil = root.data; 
                root = root.leftChild;  
            } else {
                root = root.rightChild;
            }
        }
        return ceil;
    }
}