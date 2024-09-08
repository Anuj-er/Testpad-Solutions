#include <vector>
#include <set>
void removeDuplicates(std::vector<int>& v) {
    std::set<int> seen;
    std::vector<int> uniqueElements;
    for (int num : v) {
        if (seen.find(num) == seen.end()) {
            seen.insert(num);
            uniqueElements.push_back(num);
        }
    }
    v = uniqueElements;
}