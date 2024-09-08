#include <string>
#include <cmath>
int binaryToDecimal(std::string binary) {
    int decimal = 0;
    int length = binary.length();
    for (int i = 0; i < length; ++i) {
        if (binary[i] == '1') {
            decimal += std::pow(2, length - 1 - i);
        }
    }
    return decimal;
}