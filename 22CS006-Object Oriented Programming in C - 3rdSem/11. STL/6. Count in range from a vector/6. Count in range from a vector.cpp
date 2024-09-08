#include <iostream>
#include <vector>
int countInRange(const std::vector<int>& v, int min, int max) {
    int count = 0;
    for (int num : v) {
        if (num >= min && num <= max) {
            ++count;
        }
    }
    return count;
}