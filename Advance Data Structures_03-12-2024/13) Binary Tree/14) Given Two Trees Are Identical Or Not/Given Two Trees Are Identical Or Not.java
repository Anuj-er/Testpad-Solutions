class Result {
    static int areSameTree(Node t1, Node t2) {
        if (t1 == null && t2 == null) return 1;
        if (t1 == null || t2 == null) return 0;
        if (t1.data == t2.data 
            && areSameTree(t1.left, t2.left) == 1 
            && areSameTree(t1.right, t2.right) == 1) {
            return 1;
        }
        return 0;
    }
}