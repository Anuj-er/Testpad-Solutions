#include <vector>
#include <unordered_map>
#include <set>
std::set<int> thrice(std::vector<int>& v) {
    std::unordered_map<int, int> countMap;
    std::set<int> result;
    for (int num : v) {
        countMap[num]++;
    }
    for (const auto& entry : countMap) {
        if (entry.second == 3) {
            result.insert(entry.first);
        }
    }
    return result;
}