#include <string>
void reverseString(string &str) {
    int left = 0;
    int right = str.length() - 1;
    while (left < right) {
        swap(str[left], str[right]);
        left++;
        right--;
    }
}