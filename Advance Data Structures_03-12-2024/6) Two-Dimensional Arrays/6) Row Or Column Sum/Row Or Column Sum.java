class Result {
  static long solveQuery(int N, int W, int i, char ch) {
        int completeRows = N / W;
        int lastRowElements = N % W;
        if (ch == 'R') {
            if (i > completeRows + (lastRowElements > 0 ? 1 : 0)) {
                return 0;
            }
            if (i <= completeRows) {
                long startNum = (long)(i - 1) * W + 1;
                long endNum = startNum + W - 1;
                return (W * (startNum + endNum)) / 2;
            }
            else if (lastRowElements > 0) {
                long startNum = (long)completeRows * W + 1;
                long endNum = N;
                return (lastRowElements * (startNum + endNum)) / 2;
            }
        }
        else if (ch == 'C') {
            if (i > W) {
                return 0;
            }
            long sum = 0;
            for (int row = 1; row <= completeRows; row++) {
                sum += (long)(row - 1) * W + i;
            }
            if (lastRowElements >= i) {
                sum += (long)completeRows * W + i;
            }
            return sum;
        }
        return 0;
    }
}