#include <iostream>
#include <vector>
void switchPairs(std::vector<int>& v) {
    for (size_t i = 0; i + 1 < v.size(); i += 2) {
        std::swap(v[i], v[i + 1]);
    }
}