#include <vector>
#include <deque>
#include <algorithm>
bool isrepfigitNumber(int n) {
    if (n >= 0 && n < 10) return true;
    std::vector<int> digits;
    int temp = n;
    while (temp > 0) {
        digits.push_back(temp % 10);
        temp /= 10;
    }
    std::reverse(digits.begin(), digits.end());
    int length = digits.size();
    std::deque<int> sequence(digits.begin(), digits.end());
    while (true) {
        int sum = 0;
        for (int i = 0; i < length; ++i) {
            sum += sequence[i];
        }
        if (sum == n) return true;
        if (sum > n && sum > sequence.back()) return false;
        sequence.pop_front();
        sequence.push_back(sum);
        if (sequence.size() > 2 * length) return false;
    }
}