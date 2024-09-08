#include <iostream>
#include <vector>
void cumulative(std::vector<int>& v) {
    if (v.empty()) {
        return;
    }
    int currentSum = 0;
    for (size_t i = 0; i < v.size(); ++i) {
        currentSum += v[i];
        v[i] = currentSum; 
    }
}