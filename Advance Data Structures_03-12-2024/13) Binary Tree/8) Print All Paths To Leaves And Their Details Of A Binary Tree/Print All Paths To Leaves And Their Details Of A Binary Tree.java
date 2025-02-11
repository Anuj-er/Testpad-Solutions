static void printPaths(Node root, List<Integer> currentPath, int totalPaths[]) {
    if (root == null) {
        return;
    }
    currentPath.add(root.data);
    if (root.left == null && root.right == null) {
        totalPaths[0]++;
        for (int i = 0; i < currentPath.size(); i++) {
            System.out.print(currentPath.get(i) + " ");
        }
        System.out.println(currentPath.size() - 1); 
    } else {
        printPaths(root.left, currentPath, totalPaths);
        printPaths(root.right, currentPath, totalPaths);
    }
    currentPath.remove(currentPath.size() - 1);
}
static void printAllPaths(Node root) {
    if (root == null) {
        return; 
    }
    List<Integer> currentPath = new ArrayList<>();
    int[] totalPaths = new int[1]; 
    printPaths(root, currentPath, totalPaths);
    System.out.println(totalPaths[0]);
}