#include <string>
void capitalizeFirstChar(string &str) {
    bool capitalize = true;
    for (int i = 0; i < str.length(); ++i) {
        if (isspace(str[i])) {
            capitalize = true;  
        } else if (capitalize && isalpha(str[i])) {
            str[i] = toupper(str[i]);  
            capitalize = false;  
        }
    }
}