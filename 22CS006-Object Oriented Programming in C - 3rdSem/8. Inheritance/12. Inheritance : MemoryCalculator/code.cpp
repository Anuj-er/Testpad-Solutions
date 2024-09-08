#include <iostream>
#include <unordered_map>
class MemoryCalculator : public Calculator {
private:
    std::unordered_map<int, int> memo;
    int computeCount;
    int memoCount;
public:
    MemoryCalculator(int seed) : Calculator(seed), computeCount(0), memoCount(0) {}
    int kthPrime(int k) {
        if (memo.find(k) != memo.end()) {
            ++memoCount;
            return memo[k];
        } else {
            ++computeCount;
            int result = Calculator::kthPrime(k);
            memo[k] = result;
            return result;
        }
    }
    int getComputeCount() const {
        return computeCount;
    }
    int getMemoCount() const {
        return memoCount;
    }
};