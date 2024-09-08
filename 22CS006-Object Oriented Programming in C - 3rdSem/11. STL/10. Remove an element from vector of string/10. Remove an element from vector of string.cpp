#include <iostream>
#include <vector>
#include <string>
#include <algorithm>
void removeAll(std::vector<std::string>& v, const std::string& toRemove) {
    auto newEnd = std::remove(v.begin(), v.end(), toRemove);
    v.erase(newEnd, v.end());
}