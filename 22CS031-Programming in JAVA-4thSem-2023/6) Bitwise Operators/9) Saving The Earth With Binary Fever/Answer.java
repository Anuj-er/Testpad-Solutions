class Result {
    static int getMinJumps(long n) {
        int jumps = 0;
        while (n > 0) {
            jumps += (n & 1); 
            n >>= 1;       
        }
        return jumps;
    }
  }