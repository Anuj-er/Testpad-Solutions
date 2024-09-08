#include <vector>
void removeConsecutiveDups(std::vector<int>& v) {
    if (v.empty()) return; 
    std::vector<int> result;
    result.push_back(v[0]);
    for (size_t i = 1; i < v.size(); ++i) {
        if (v[i] != v[i - 1]) {
            result.push_back(v[i]);
        }
    }
    v = result;
}