#include <iostream>
#include <vector>
double mean(const std::vector<double>& v) {
    if (v.empty()) {
        return 0.0;
    }
    double sum = 0.0;
    for (double num : v) {
        sum += num;
    }
    return sum / v.size();
}