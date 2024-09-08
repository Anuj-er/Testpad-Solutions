#include <vector>
std::vector<int> intersection(const std::vector<int>& v1, const std::vector<int>& v2) {
    std::vector<int> result;
    size_t i = 0, j = 0;
    while (i < v1.size() && j < v2.size()) {
        if (v1[i] < v2[j]) {
            ++i;
        } else if (v1[i] > v2[j]) {
            ++j;
        } else {
            result.push_back(v1[i]);
            ++i;
            ++j;
        }
    }
    return result;
}