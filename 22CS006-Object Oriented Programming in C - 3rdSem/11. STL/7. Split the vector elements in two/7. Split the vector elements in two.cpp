#include <iostream>
#include <vector>
void split(std::vector<int>& v) {
    std::vector<int> result;
    for (int num : v) {
        if (num % 2 == 0) {
            int half = num / 2;
            result.push_back(half);
            result.push_back(half);
        } else {
            int first = num / 2 + 1;
            int second = num / 2;
            result.push_back(first);
            result.push_back(second);
        }
    }
    v = result;
}