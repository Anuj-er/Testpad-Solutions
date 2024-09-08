#include <iostream>
#include <vector>
#include <string>
void beautify(std::vector<std::string>& v) {
    std::vector<std::string> result;
    result.push_back("#");
    for (const auto& str : v) {
        result.push_back(str);
        result.push_back("#");
    }
    v = result;
}