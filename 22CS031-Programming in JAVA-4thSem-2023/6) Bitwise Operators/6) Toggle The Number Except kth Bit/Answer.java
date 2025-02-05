class Result{
    static long toggleExceptKthBit(long N,int k){
      long mask = 1L << k;
          return ~N ^ mask; 
    }
  }