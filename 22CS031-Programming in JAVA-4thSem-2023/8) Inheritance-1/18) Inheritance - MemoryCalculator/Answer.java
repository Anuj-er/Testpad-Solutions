class MemoryCalculator extends Calculator {
    private HashMap<Integer, Integer> memoizedPrimes;
    private int computeCount;
    private int memoCount;
    public MemoryCalculator(int seed) {
        super(seed);
        memoizedPrimes = new HashMap<>();
        computeCount = 0;
        memoCount = 0;
    }
    @Override
    public int kthPrime(int k) {
        if (memoizedPrimes.containsKey(k)) {
            memoCount++;
            return memoizedPrimes.get(k);
        } else {
            int result = super.kthPrime(k);
            memoizedPrimes.put(k, result);
            computeCount++;
            return result;
        }
    }
    public int getComputeCount() {
        return computeCount;
    }
    public int getMemoCount() {
        return memoCount;
    }
}