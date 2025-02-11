class Result {
    static int evaluateTree(Node root) {
      if (root == null) {
        return 0; // or throw an exception
      }
      if (root.leftChild == null && root.rightChild == null) {
        return root.data;
      }
      int leftVal = evaluateTree(root.leftChild);
      int rightVal = evaluateTree(root.rightChild);
      switch (root.data) {
        case 43: // '+'
          return leftVal + rightVal;
        case 45: // '-'
          return leftVal - rightVal;
        case 42: // '*'
          return leftVal * rightVal;
        case 47: // '/'
          if (rightVal == 0) {
            throw new ArithmeticException("Division by zero");
          }
          return leftVal / rightVal;
        default:
          throw new IllegalArgumentException("Invalid Operator: " + root.data);
      }
    }
  }