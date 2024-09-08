#include <vector>
#include <string>
void removeOdd(std::vector<std::string>& v) {
    std::vector<std::string> result;
    for (const auto& str : v) {
        if (str.length() % 2 == 0) {
            result.push_back(str);
        }
    }
    v = result;
}