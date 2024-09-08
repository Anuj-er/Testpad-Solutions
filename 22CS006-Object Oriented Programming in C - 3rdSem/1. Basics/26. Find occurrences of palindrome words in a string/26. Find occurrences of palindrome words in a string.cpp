#include<sstream>
bool isPalindrome(const string &word) {
    int left = 0;
    int right = word.size() - 1;
    while (left < right) {
        if (tolower(word[left]) != tolower(word[right])) {
            return false;
        }
        left++;
        right--;
    }
    return true;
}
int countPalindrome(string str) {
    stringstream ss(str);
    string word;
    int count = 0;
    while (ss >> word) {
        if (isPalindrome(word)) {
            count++;
        }
    }
    return count;
}