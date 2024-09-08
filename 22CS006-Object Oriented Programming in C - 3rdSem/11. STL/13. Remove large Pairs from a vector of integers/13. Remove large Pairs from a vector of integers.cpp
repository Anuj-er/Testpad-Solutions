#include <vector>
void removeLargePairs(std::vector<int>& v) {
    std::vector<int> result;
    size_t i = 0;
    while (i + 1 < v.size()) {
        if (v[i] <= v[i + 1]) {
            result.push_back(v[i]);
            result.push_back(v[i + 1]);
        }
        i += 2;
    }
    if (v.size() % 2 != 0) {
        result.push_back(v.back());
    }
    v = result;
}